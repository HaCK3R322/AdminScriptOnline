package com.androsov.adminscriptonline.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class CategoryDto {
    @Min(value = 1)
    @Max(value = 3)
    private Integer level;
}
