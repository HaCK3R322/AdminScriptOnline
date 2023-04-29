package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.CategoryDto;
import com.androsov.adminscriptonline.entities.Category;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryDtoToCategoryConverter implements Converter<CategoryDto, Category> {

    @Override
    public Category convert(CategoryDto source) {
        Category category = new Category();
        category.setLevel(source.getLevel());
        return category;
    }
}
