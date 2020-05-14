package com.cimspace.stockup.services;

import com.cimspace.stockup.models.Order;

import java.time.LocalDate;

public interface OrderService {

    public Iterable<Order> getAllOrders();
    public Order create(Order order);
    public void update(Order order);
}
