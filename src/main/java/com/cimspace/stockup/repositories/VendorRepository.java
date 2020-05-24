package com.cimspace.stockup.repositories;

import com.cimspace.stockup.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
