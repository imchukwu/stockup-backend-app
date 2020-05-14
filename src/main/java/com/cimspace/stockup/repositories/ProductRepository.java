package com.cimspace.stockup.repositories;

import com.cimspace.stockup.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
