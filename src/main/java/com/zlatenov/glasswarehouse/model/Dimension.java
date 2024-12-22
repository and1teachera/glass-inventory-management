package com.zlatenov.glasswarehouse.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the dimensions of a glass product.
 * This class stores the width and height of a product specification.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Dimension {

    @Positive(message = "Width must be positive")
    private double width;
    @Positive(message = "Height must be positive")
    private double height;
}