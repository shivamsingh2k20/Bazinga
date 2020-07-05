package com.shivam.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.shivam.ecommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
