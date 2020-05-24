//package com.cimspace.stockup.domain;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import javax.validation.Valid;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "orders")
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @JsonFormat(pattern = "dd/MM/yyyy")
//    private LocalDate dateCreated;
//
//    private String status;
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "pk.order")
//    @Valid
//    private List<OrderProduct> orderProducts = new ArrayList<>();
//
//    @Transient
//    public Double getTotalOrderPrice() {
//        double sum = 0D;
//        List<OrderProduct> orderProducts = getOrderProducts();
//        for (OrderProduct op : orderProducts) {
//            sum += op.getTotalPrice();
//        }
//        return sum;
//    }
//
//    @Transient
//    public int getNumberOfProducts() {
//        return this.orderProducts.size();
//    }
//
//    // standard getters and setters
//}
