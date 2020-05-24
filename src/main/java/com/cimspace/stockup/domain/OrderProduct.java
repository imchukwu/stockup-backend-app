//package com.cimspace.stockup.domain;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.Transient;
//
//@Getter
//@Setter
//@Entity
//public class OrderProduct {
//
//    @EmbeddedId
//    @JsonIgnore
//    private OrderProductPK pk;
//
//    @Column(nullable = false)
//    private Integer quantity;
//
//    // default constructor
//
//    public OrderProduct(Order order, Product product, Integer quantity) {
//        pk = new OrderProductPK();
//        pk.setOrder(order);
//        pk.setProduct(product);
//        this.quantity = quantity;
//    }
//
//    @Transient
//    public Product getProduct() {
//        return this.pk.getProduct();
//    }
//
//    @Transient
//    public Double getTotalPrice() {
//        return getProduct().getPrice() * getQuantity();
//    }
//
//    // hashcode() and equals() methods
//
//}
