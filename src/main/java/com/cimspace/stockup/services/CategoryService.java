package com.cimspace.stockup.services;

import com.cimspace.stockup.api.v1.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}
