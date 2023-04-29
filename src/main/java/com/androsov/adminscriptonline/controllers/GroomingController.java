package com.androsov.adminscriptonline.controllers;

import com.androsov.adminscriptonline.dto.GroomingDto;
import com.androsov.adminscriptonline.dto.converters.GroomingDtoToGroomingConverter;
import com.androsov.adminscriptonline.dto.converters.GroomingToGroomingDtoConverter;
import com.androsov.adminscriptonline.entities.Grooming;
import com.androsov.adminscriptonline.services.GroomingService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class GroomingController {
    private GroomingService groomingService;
    private GroomingDtoToGroomingConverter groomingDtoToGroomingConverter;
    private GroomingToGroomingDtoConverter groomingToGroomingDtoConverter;

    @PostMapping(path = "/grooming/create")
    public ResponseEntity<GroomingDto> groomingCreate(@RequestBody GroomingDto groomingDto) {
        Grooming grooming = groomingDtoToGroomingConverter.convert(groomingDto);
        grooming = groomingService.createGrooming(grooming);

        return new ResponseEntity<>(groomingToGroomingDtoConverter.convert(grooming), HttpStatus.CREATED);
    }

    @GetMapping(path = "/grooming/get/all")
    public ResponseEntity<List<GroomingDto>> groomingGetAll() {
        List<Grooming> groomings = groomingService.getAll();
        List<GroomingDto> groomingDtos = groomings.stream()
                .map(e -> groomingToGroomingDtoConverter.convert(e))
                .toList();

        return new ResponseEntity<>(groomingDtos, HttpStatus.OK);
    }

}
