package com.tech.repository;

import org.springframework.data.repository.CrudRepository;

import com.tech.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
