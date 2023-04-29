package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.CategoryDto;
import com.androsov.adminscriptonline.entities.Category;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryDtoConverter implements Converter<Category, CategoryDto> {

    @Override
    public CategoryDto convert(Category source) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setLevel(source.getLevel());
        return categoryDto;
    }
}
