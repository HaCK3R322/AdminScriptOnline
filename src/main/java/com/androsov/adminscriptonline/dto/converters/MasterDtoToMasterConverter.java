package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.MasterDto;
import com.androsov.adminscriptonline.entities.Master;
import com.androsov.adminscriptonline.repositories.CategoryRepository;
import com.androsov.adminscriptonline.repositories.SalonRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class MasterDtoToMasterConverter implements Converter<MasterDto, Master> {
    private SalonRepository salonRepository;
    private CategoryRepository categoryRepository;

    @Override
    public Master convert(MasterDto source) {
        Master master = new Master();
        master.setName(source.getName());
        master.setSurname(source.getSurname());
        master.setPatronymic(source.getPatronymic());
        master.setCategory(categoryRepository.findByLevel(source.getCategoryLevel()));
        master.setSalon(salonRepository.findByName(source.getName()));

        return master;
    }
}
