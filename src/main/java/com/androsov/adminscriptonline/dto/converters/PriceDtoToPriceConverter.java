package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.PriceDto;
import com.androsov.adminscriptonline.entities.Price;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PriceDtoToPriceConverter implements Converter<PriceDto, Price> {

    @Override
    public Price convert(PriceDto source) {
        Price price = new Price();
        price.setValue(source.getValue());
        price.setTime(source.getTime());
        return price;
    }
}
