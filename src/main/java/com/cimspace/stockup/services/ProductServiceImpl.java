package com.cimspace.stockup.services;

import com.cimspace.stockup.models.Product;
import com.cimspace.stockup.repositories.ProductRepository;
import org.hibernate.PropertyNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    // productRepository constructor injection
    public final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new PropertyNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
