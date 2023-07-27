package com.dgmf.service.impl;

import com.dgmf.entity.Category;
import com.dgmf.repository.CategoryRepository;
import com.dgmf.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;


    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
