//package com.cimspace.stockup.controllers;
//
//import com.cimspace.stockup.domain.Product;
//import com.cimspace.stockup.services.ProductService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.constraints.NotNull;
//
//@RestController
//@RequestMapping("/api/products")
//public class ProductController {
//
//    // productService constructor injection
//
//    public final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping(value = { "", "/" })
//    public @NotNull Iterable<Product> getProducts() {
//        return productService.getAllProducts();
//    }
//}
