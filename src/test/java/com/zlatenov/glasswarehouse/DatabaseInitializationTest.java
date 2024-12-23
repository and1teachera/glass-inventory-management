package com.zlatenov.glasswarehouse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Angel Zlatenov
 */

@SpringBootTest
@Transactional
public class DatabaseInitializationTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void shouldEstablishDatabaseConnection() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            assertThat(connection).isNotNull();
            assertThat(connection.isValid(2)).isTrue();
        }
    }

    @Test
    void shouldCreateDatabaseSchema() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();

            String[] requiredTables = {
                    "inventory_entry",
                    "inventory_log",
                    "product",
                    "product_specification"
            };

            for (String tableName : requiredTables) {
                try (ResultSet tables = metaData.getTables(null, null, tableName, null)) {
                    assertThat(tables.next()).as("Table " + tableName + " should exist").isTrue();
                }
            }
            String[] requiredSequences = {
                    "inventory_entry_seq",
                    "inventory_log_seq",
                    "product_seq",
                    "product_specification_seq"
            };

            for (String sequenceName : requiredSequences) {
                try (ResultSet sequences = metaData.getColumns(null, null, sequenceName, null)) {
                    assertThat(sequences.next()).as("Sequence " + sequenceName + " should exist").isTrue();
                }
            }
        }
    }
}
