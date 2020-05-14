package com.cimspace.stockup.services;

import com.cimspace.stockup.models.Product;

public interface ProductService {

    public Iterable<Product> getAllProducts();
    public Product getProduct(Long id);
    public Product save(Product product);
}
