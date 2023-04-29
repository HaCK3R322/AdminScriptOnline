package com.androsov.adminscriptonline.controllers;

import com.androsov.adminscriptonline.dto.MasterDto;
import com.androsov.adminscriptonline.dto.converters.MasterDtoToMasterConverter;
import com.androsov.adminscriptonline.dto.converters.MasterToMasterDtoConverter;
import com.androsov.adminscriptonline.entities.Master;
import com.androsov.adminscriptonline.services.MasterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class MasterController {
    private MasterService masterService;
    private MasterDtoToMasterConverter masterDtoToMasterConverter;
    private MasterToMasterDtoConverter masterToMasterDtoConverter;

    @PostMapping(path = "/master/create")
    public ResponseEntity<MasterDto> create(@RequestBody MasterDto masterDto) {
        Master master = masterService.createMaster(masterDtoToMasterConverter.convert(masterDto));

        master = masterService.createMaster(master);

        return new ResponseEntity<>(masterToMasterDtoConverter.convert(master), HttpStatus.CREATED);
    }

    @GetMapping(path = "/master/get/all")
    public ResponseEntity<List<MasterDto>> breedGetAll() {
        List<Master> masters = masterService.getAll();
        List<MasterDto> masterDtos = masters.stream()
                .map(e -> masterToMasterDtoConverter.convert(e))
                .toList();

        return new ResponseEntity<>(masterDtos, HttpStatus.OK);
    }
}
