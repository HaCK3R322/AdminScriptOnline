package com.androsov.adminscriptonline.dto;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class BreedDto {
    private String name;

    @Min(value = 1)
    @Max(value = 3)
    private Integer size;
}
