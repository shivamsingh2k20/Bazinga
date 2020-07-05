package com.shivam.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.shivam.ecommerce.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
