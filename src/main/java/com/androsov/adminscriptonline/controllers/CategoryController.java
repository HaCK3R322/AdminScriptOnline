package com.androsov.adminscriptonline.controllers;

import com.androsov.adminscriptonline.dto.BreedDto;
import com.androsov.adminscriptonline.dto.CategoryDto;
import com.androsov.adminscriptonline.dto.converters.BreedDtoToBreedConverter;
import com.androsov.adminscriptonline.dto.converters.BreedToBreedDtoConverter;
import com.androsov.adminscriptonline.dto.converters.CategoryDtoToCategoryConverter;
import com.androsov.adminscriptonline.dto.converters.CategoryToCategoryDtoConverter;
import com.androsov.adminscriptonline.entities.Breed;
import com.androsov.adminscriptonline.entities.Category;
import com.androsov.adminscriptonline.services.BreedService;
import com.androsov.adminscriptonline.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;

    private CategoryDtoToCategoryConverter categoryDtoToCategoryConverter;
    private CategoryToCategoryDtoConverter categoryToCategoryDtoConverter;

    @PostMapping(path = "/category/create")
    public ResponseEntity<CategoryDto> breedCreate(@RequestBody CategoryDto categoryDto) {
        Category category = categoryDtoToCategoryConverter.convert(categoryDto);
        category = categoryService.createCategory(category);

        return new ResponseEntity<>(categoryToCategoryDtoConverter.convert(category), HttpStatus.CREATED);
    }

    @GetMapping(path = "/category/get/all")
    public ResponseEntity<List<CategoryDto>> breedGetAll() {
        List<Category> categories = categoryService.getAll();
        List<CategoryDto> categoryDtos = categories.stream()
                .map(e -> categoryToCategoryDtoConverter.convert(e))
                .toList();

        return new ResponseEntity<>(categoryDtos, HttpStatus.OK);
    }
}
