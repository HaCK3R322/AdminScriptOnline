package com.androsov.adminscriptonline.dto;

import lombok.Data;

@Data
public class GroomingDto {
    private String name;
    private String breedName;
    private PriceDto priceDto;
    private Integer categoryLevel;
}
