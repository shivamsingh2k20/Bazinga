package com.shivam.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.shivam.ecommerce.model.OrderProduct;
import com.shivam.ecommerce.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
