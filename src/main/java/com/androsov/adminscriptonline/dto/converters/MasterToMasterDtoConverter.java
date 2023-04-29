package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.MasterDto;
import com.androsov.adminscriptonline.entities.Master;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MasterToMasterDtoConverter implements Converter<Master, MasterDto> {

    @Override
    public MasterDto convert(Master source) {
        MasterDto masterDto = new MasterDto();
        masterDto.setName(source.getName());
        masterDto.setSurname(source.getSurname());
        masterDto.setPatronymic(source.getPatronymic());
        masterDto.setCategoryLevel(source.getCategory().getLevel());
        masterDto.setSalonName(source.getSalon().getName());

        return masterDto;
    }
}
