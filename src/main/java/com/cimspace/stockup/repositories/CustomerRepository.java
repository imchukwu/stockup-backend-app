package com.cimspace.stockup.repositories;

import com.cimspace.stockup.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}