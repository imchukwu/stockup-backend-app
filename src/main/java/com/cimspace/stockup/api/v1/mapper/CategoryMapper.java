package com.cimspace.stockup.api.v1.mapper;

import com.cimspace.stockup.api.v1.dto.CategoryDTO;
import com.cimspace.stockup.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);

}
