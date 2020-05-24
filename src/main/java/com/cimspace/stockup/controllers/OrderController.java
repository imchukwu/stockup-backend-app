//package com.cimspace.stockup.controllers;
//
//import com.cimspace.stockup.api.v1.dto.OrderProductDto;
//import com.cimspace.stockup.services.OrderService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//
//    public final OrderService orderService;
//
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
////    @PostMapping
////    public ResponseEntity<Order> create(@RequestBody OrderForm form) {
////        List<OrderProductDto> formDtos = form.getProductOrders();
////        validateProductsExistence(formDtos);
////        // create order logic
////        // populate order with products
////
////        order.setOrderProducts(orderProducts);
////        this.orderService.update(order);
////
////        String uri = ServletUriComponentsBuilder
////                .fromCurrentServletMapping()
////                .path("/orders/{id}")
////                .buildAndExpand(order.getId())
////                .toString();
////        HttpHeaders headers = new HttpHeaders();
////        headers.add("Location", uri);
////
////        return new ResponseEntity<>(order, headers, HttpStatus.CREATED);
////    }
//}
