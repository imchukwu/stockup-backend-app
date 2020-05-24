//package com.cimspace.stockup.domain;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@Entity
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotNull(message = "Product name is required.")
//    @Basic(optional = false)
//    private String name;
//
//    private Double price;
//
//    private String pictureUrl;
//
//}
