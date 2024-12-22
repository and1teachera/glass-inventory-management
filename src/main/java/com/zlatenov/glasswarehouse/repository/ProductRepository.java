package com.zlatenov.glasswarehouse.repository;

import com.zlatenov.glasswarehouse.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Product entities.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}