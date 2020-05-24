package com.cimspace.stockup.repositories;

import com.cimspace.stockup.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);
}
