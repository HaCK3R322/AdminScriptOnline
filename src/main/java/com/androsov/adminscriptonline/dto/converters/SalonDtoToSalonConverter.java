package com.androsov.adminscriptonline.dto.converters;


import com.androsov.adminscriptonline.dto.SalonDto;
import com.androsov.adminscriptonline.entities.Salon;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SalonDtoToSalonConverter implements Converter<SalonDto, Salon> {
    @Override
    public Salon convert(SalonDto source) {
        Salon salon = new Salon();
        salon.setName(source.getName());
        salon.setAddress(source.getAddress());
        salon.setPath(source.getPath());

        return salon;
    }
}
