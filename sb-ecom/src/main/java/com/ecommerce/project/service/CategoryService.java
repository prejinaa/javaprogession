package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    void createCategory(Category category);


    String deleteCategory(long categoryId);

    Category updateCategory(Category category, long categoryId);
}
