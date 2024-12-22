package com.zlatenov.glasswarehouse.model.entity;

import com.zlatenov.glasswarehouse.model.Quantity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Represents an inventory entry for a specific product specification in the warehouse.
 * This class tracks the quantity of a product specification and when it was last updated.
 */
@Data
@NoArgsConstructor
@Entity
public class InventoryEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "product_specification_id", updatable = false)
    private long productSpecificationId;

    @Embedded
    private Quantity quantity;

    @Column(name = "last_updated", nullable = false)
    private LocalDateTime lastUpdated;

    public InventoryEntry(Long productSpecificationId, Quantity quantity) {
        this.productSpecificationId = productSpecificationId;
        this.quantity = quantity;
        this.lastUpdated = LocalDateTime.now();
    }

    /**
     * Sets the Quantity of the product specification in inventory.
     *
     * @param quantity The Quantity to set
     */
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
        this.lastUpdated = LocalDateTime.now();
    }
}