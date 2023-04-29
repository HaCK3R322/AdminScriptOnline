package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.BreedDto;
import com.androsov.adminscriptonline.entities.Breed;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BreedToBreedDtoConverter implements Converter<Breed, BreedDto> {
    @Override
    public BreedDto convert(Breed source) {
        BreedDto breedDto = new BreedDto();
        breedDto.setName(source.getName());
        breedDto.setSize(source.getSize());
        return breedDto;
    }
}
