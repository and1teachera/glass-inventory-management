package com.zlatenov.glasswarehouse.model;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * Represents the quantity of a product variation in the inventory.
 * This class tracks the number of packs, items per pack, and standalone items.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quantity {

    @PositiveOrZero(message = "Number of packs must be zero or positive")
    private int numberOfPacks;

    @PositiveOrZero(message = "Items per pack must be zero or positive")
    private int itemsPerPack;

    @PositiveOrZero(message = "Standalone items must be zero or positive")
    private int standaloneItems;

    public int getTotalItems() {
        return (numberOfPacks * itemsPerPack) + standaloneItems;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof final Quantity quantity)) {
            return false;
        }
        return getNumberOfPacks() == quantity.getNumberOfPacks() && getItemsPerPack() == quantity.getItemsPerPack() &&
                getStandaloneItems() == quantity.getStandaloneItems();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfPacks(), getItemsPerPack(), getStandaloneItems());
    }
}