package com.zlatenov.glasswarehouse.repository;

import com.zlatenov.glasswarehouse.model.entity.InventoryLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for InventoryLog entities.
 */
@Repository
public interface InventoryLogRepository extends JpaRepository<InventoryLog, Long> {

}