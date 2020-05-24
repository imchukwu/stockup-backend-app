//package com.cimspace.stockup.services.Impl;
//
//import com.cimspace.stockup.domain.Order;
//import com.cimspace.stockup.repositories.OrderRepository;
//import com.cimspace.stockup.services.OrderService;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.time.LocalDate;
//
//@Service
//@Transactional
//public class OrderServiceImpl implements OrderService {
//
//    public final OrderRepository orderRepository;
//
//    public OrderServiceImpl(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    @Override
//    public Iterable<Order> getAllOrders() {
//        return this.orderRepository.findAll();
//    }
//
//    @Override
//    public Order create(Order order) {
//        order.setDateCreated(LocalDate.now());
//        return this.orderRepository.save(order);
//    }
//
//    @Override
//    public void update(Order order) {
//        this.orderRepository.save(order);
//    }
//}
