package com.androsov.adminscriptonline.dto.converters;

import com.androsov.adminscriptonline.dto.SalonDto;
import com.androsov.adminscriptonline.entities.Salon;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SalonToSalonDtoConverter implements Converter<Salon, SalonDto> {

    @Override
    public SalonDto convert(Salon source) {
        SalonDto salonDto = new SalonDto();
        salonDto.setName(source.getName());
        salonDto.setPath(source.getPath());
        salonDto.setAddress(source.getAddress());

        return salonDto;
    }
}
