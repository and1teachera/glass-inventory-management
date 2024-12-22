package com.zlatenov.glasswarehouse.model.entity;

import com.zlatenov.glasswarehouse.model.OperationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Represents a log entry for inventory operations in the Glass Inventory Management system.
 * This class tracks changes to inventory levels, including the type of operation,
 * the product affected, and the quantity changed.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InventoryLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "operation_type", nullable = false)
    private OperationType operationType;

    @ManyToOne
    @JoinColumn(name = "product_specification_id")
    private ProductSpecification productSpecification;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column
    private String reason;

    @Column
    private String amount;

    public InventoryLog(OperationType operationType, ProductSpecification productSpecification, String reason, String amount) {
        this.operationType = operationType;
        this.productSpecification = productSpecification;
        this.timestamp = LocalDateTime.now();
        this.reason = reason;
        this.amount = amount;
    }
}