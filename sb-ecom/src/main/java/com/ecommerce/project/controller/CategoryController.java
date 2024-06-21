package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private  CategoryService categoryService;

    @GetMapping("/api/public/categories")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories=categoryService.getAllCategory();
        return new ResponseEntity<>(categories,HttpStatus.OK);
    }
    @PostMapping("/api/public/categories")
    //we are managing status code here
    public ResponseEntity<String> createCategories(@RequestBody Category category){
        categoryService.createCategory(category);
          return new ResponseEntity<>("create  categories successfully",HttpStatus.CREATED);
    }

    @DeleteMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<String> deleteCategories(@PathVariable long categoryId) {
        //here we throw correct status if id doesn't found along with some Response
        try {
            String status = categoryService.deleteCategory(categoryId);
            //return ResponseEntity.OK(status)
            return new ResponseEntity<>(status, HttpStatus.OK);
        }
        catch (ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(),e.getStatusCode());
        }
    }
    @PutMapping("/api/public/categories/{categoryId}")
    public ResponseEntity<String> updateCategories(@RequestBody Category category
            ,@PathVariable long categoryId) {
        //here we throw correct status if id doesn't found along with some Response
        try {
            Category savedCategory = categoryService.updateCategory(category,categoryId);
            //return ResponseEntity.OK(status)
            return new ResponseEntity<>("category with category id "+categoryId+" Update", HttpStatus.OK);
        }
        catch (ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(),e.getStatusCode());
        }
    }

}
