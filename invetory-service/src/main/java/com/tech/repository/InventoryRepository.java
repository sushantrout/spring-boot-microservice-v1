package com.tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
