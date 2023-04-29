package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.GroomingDto;
import com.androsov.adminscriptonline.dto.PriceDto;
import com.androsov.adminscriptonline.entities.Grooming;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GroomingToGroomingDtoConverter implements Converter<Grooming, GroomingDto> {

    @Override
    public GroomingDto convert(Grooming source) {
        GroomingDto groomingDto = new GroomingDto();
        groomingDto.setName(source.getName());
        groomingDto.setCategoryLevel(source.getCategory().getLevel());
        groomingDto.setBreedName(source.getBreed().getName());

        PriceDto priceDto = new PriceDto();
        priceDto.setValue(source.getPrice().getValue());
        priceDto.setTime(source.getPrice().getTime());
        groomingDto.setPriceDto(priceDto);

        return groomingDto;
    }
}
