package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.PriceDto;
import com.androsov.adminscriptonline.entities.Price;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PriceToPriceDtoConverter implements Converter<Price, PriceDto> {
    @Override
    public PriceDto convert(Price source) {
        PriceDto priceDto = new PriceDto();
        priceDto.setTime(source.getTime());
        priceDto.setValue(source.getValue());
        return priceDto;
    }
}
