package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.GroomingDto;
import com.androsov.adminscriptonline.entities.Grooming;
import com.androsov.adminscriptonline.repositories.BreedRepository;
import com.androsov.adminscriptonline.repositories.CategoryRepository;
import com.androsov.adminscriptonline.repositories.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GroomingDtoToGroomingConverter implements Converter<GroomingDto, Grooming> {
    private BreedRepository breedRepository;
    private PriceRepository priceRepository;
    private CategoryRepository categoryRepository;

    @Override
    public Grooming convert(GroomingDto source) {
        Grooming grooming = new Grooming();
        grooming.setName(source.getName());
        grooming.setCategory(categoryRepository.findByLevel(source.getCategoryLevel()));
        grooming.setBreed(breedRepository.findByName(source.getBreedName()));
        grooming.setPrice(priceRepository.findByTime(source.getPriceDto().getTime()));

        return grooming;
    }
}
