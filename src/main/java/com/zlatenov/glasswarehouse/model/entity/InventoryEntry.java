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
 * Represents an inventory entry for a specific product variation in the warehouse.
 * This class tracks the quantity of a product variation and when it was last updated.
 */
@Data
@NoArgsConstructor
@Entity
public class InventoryEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "product_variation_id", updatable = false)
    private long productVariationId;

    @Embedded
    private Quantity quantity;

    @Column(name = "last_updated", nullable = false)
    private LocalDateTime lastUpdated;

    public InventoryEntry(Long productVariationId, Quantity quantity) {
        this.productVariationId = productVariationId;
        this.quantity = quantity;
        this.lastUpdated = LocalDateTime.now();
    }

    /**
     * Sets the Quantity of the product variation in inventory.
     *
     * @param quantity The Quantity to set
     */
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
        this.lastUpdated = LocalDateTime.now();
    }
}