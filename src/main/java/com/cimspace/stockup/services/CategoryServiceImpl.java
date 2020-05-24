package com.cimspace.stockup.services;

import com.cimspace.stockup.api.v1.dto.CategoryDTO;
import com.cimspace.stockup.api.v1.mapper.CategoryMapper;
import com.cimspace.stockup.domain.Category;
import com.cimspace.stockup.repositories.CategoryRepository;
import com.cimspace.stockup.services.CategoryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.cimspace.stockup.utils.IteratableToStream.getStreamFromIterable;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    public final CategoryRepository categoryRepository;
    public final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        Iterable<Category> iterable = categoryRepository.findAll();
        Stream<Category> stream = getStreamFromIterable(iterable);

        return stream.map(categoryMapper::categoryToCategoryDTO)
                .collect(Collectors.toList());}

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return categoryMapper.categoryToCategoryDTO(categoryRepository.findByName(name));
    }


}
