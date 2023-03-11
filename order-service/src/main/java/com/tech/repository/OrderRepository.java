package com.tech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tech.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{

}
