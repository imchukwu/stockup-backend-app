package com.cimspace.stockup.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    private String name;

    private Double price;

    private String pictureUrl;

    public Product(@NotNull(message = "Product name is required.") String name, Double price, String pictureUrl) {
        this.name = name;
        this.price = price;
        this.pictureUrl = pictureUrl;
    }
}
