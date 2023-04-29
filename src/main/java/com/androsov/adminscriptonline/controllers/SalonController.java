package com.androsov.adminscriptonline.controllers;

import com.androsov.adminscriptonline.dto.BreedDto;
import com.androsov.adminscriptonline.dto.SalonDto;
import com.androsov.adminscriptonline.dto.converters.SalonDtoToSalonConverter;
import com.androsov.adminscriptonline.dto.converters.SalonToSalonDtoConverter;
import com.androsov.adminscriptonline.entities.Breed;
import com.androsov.adminscriptonline.entities.Salon;
import com.androsov.adminscriptonline.repositories.SalonRepository;
import com.androsov.adminscriptonline.services.SalonService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class SalonController {
    private SalonService salonService;
    private SalonDtoToSalonConverter salonDtoToSalonConverter;
    private SalonToSalonDtoConverter salonToSalonDtoConverter;

    @PostMapping(path = "/salon/create")
    public ResponseEntity<SalonDto> create(@RequestBody SalonDto salonDto) {
        Salon salon = salonService.createSalon(salonDtoToSalonConverter.convert(salonDto));

        salon = salonService.createSalon(salon);

        return new ResponseEntity<SalonDto>(salonToSalonDtoConverter.convert(salon), HttpStatus.CREATED);
    }

    @GetMapping(path = "/salon/get/all")
    public ResponseEntity<List<SalonDto>> breedGetAll() {
        List<Salon> salons = salonService.getAll();
        List<SalonDto> salonDtos = salons.stream()
                .map(e -> salonToSalonDtoConverter.convert(e))
                .toList();

        return new ResponseEntity<>(salonDtos, HttpStatus.OK);
    }
}
