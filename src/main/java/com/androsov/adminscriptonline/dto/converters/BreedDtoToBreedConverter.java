package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.BreedDto;
import com.androsov.adminscriptonline.entities.Breed;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BreedDtoToBreedConverter implements Converter<BreedDto, Breed> {

    @Override
    public Breed convert(BreedDto source) {
        Breed breed = new Breed();
        breed.setSize(source.getSize());
        breed.setName(source.getName());
        return breed;
    }
}
