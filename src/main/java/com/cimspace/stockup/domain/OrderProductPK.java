//package com.cimspace.stockup.domain;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.Embeddable;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import java.io.Serializable;
//
//@Getter
//@Setter
//@EqualsAndHashCode
//@Embeddable
//public class OrderProductPK implements Serializable {
//
//    @JsonBackReference
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id")
//    private Order order;
//
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id")
//    private Product product;
//
//}
