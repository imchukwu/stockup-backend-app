package com.cimspace.stockup.repositories;

import com.cimspace.stockup.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
