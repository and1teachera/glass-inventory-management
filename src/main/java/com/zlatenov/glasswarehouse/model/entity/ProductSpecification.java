package com.zlatenov.glasswarehouse.model.entity;

import com.zlatenov.glasswarehouse.model.Dimension;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a specific specification of a glass product in the inventory management system.
 * This class contains detailed information about a product specification, including its
 * attributes such as thickness, type, dimensions, and type.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column
    private String thickness;

    @Column
    private String type;

    @Column(length = 50)
    private String glassmaker;

    @Embedded
    private Dimension dimension;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_specification_id")
    private List<InventoryEntry> inventoryEntries = new ArrayList<>();

}