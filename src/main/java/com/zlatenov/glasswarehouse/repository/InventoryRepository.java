package com.zlatenov.glasswarehouse.repository;

import com.zlatenov.glasswarehouse.model.entity.InventoryEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for InventoryEntry entities.
 */
@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntry, Long> {


}