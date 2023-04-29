package com.androsov.adminscriptonline.controllers;

import com.androsov.adminscriptonline.dto.BreedDto;
import com.androsov.adminscriptonline.dto.converters.BreedDtoToBreedConverter;
import com.androsov.adminscriptonline.dto.converters.BreedToBreedDtoConverter;
import com.androsov.adminscriptonline.entities.Breed;
import com.androsov.adminscriptonline.services.BreedService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin
@AllArgsConstructor
public class BreedController {
    private BreedService breedService;

    private BreedDtoToBreedConverter breedDtoToBreedConverter;
    private BreedToBreedDtoConverter breedToBreedDtoConverter;

    @PostMapping(path = "/breed/create")
    public ResponseEntity<BreedDto> breedCreate(@RequestBody BreedDto breedDto) {
        Breed breed = breedDtoToBreedConverter.convert(breedDto);
        breed = breedService.createBreed(breed);

        return new ResponseEntity<>(breedToBreedDtoConverter.convert(breed), HttpStatus.CREATED);
    }

    @GetMapping(path = "/breed/get/all")
    public ResponseEntity<List<BreedDto>> breedGetAll() {
        List<Breed> breeds = breedService.getAll();
        List<BreedDto> breedDtos = breeds.stream()
                .map(e -> breedToBreedDtoConverter.convert(e))
                .toList();

        return new ResponseEntity<>(breedDtos, HttpStatus.OK);
    }

}
