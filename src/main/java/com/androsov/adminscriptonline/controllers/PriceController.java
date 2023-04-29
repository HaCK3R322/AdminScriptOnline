package com.androsov.adminscriptonline.controllers;

import com.androsov.adminscriptonline.dto.PriceDto;
import com.androsov.adminscriptonline.dto.converters.PriceDtoToPriceConverter;
import com.androsov.adminscriptonline.dto.converters.PriceToPriceDtoConverter;
import com.androsov.adminscriptonline.entities.Price;
import com.androsov.adminscriptonline.services.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@AllArgsConstructor
public class PriceController {
    private PriceService priceService;
    private PriceDtoToPriceConverter priceDtoToPriceConverter;
    private PriceToPriceDtoConverter priceToPriceDtoConverter;

    @PostMapping(path = "/price/create")
    public ResponseEntity<Price> create(@RequestBody PriceDto priceDto) {
        Price price = priceDtoToPriceConverter.convert(priceDto);
        price = priceService.createPrice(price);

        return new ResponseEntity<>(price, HttpStatus.CREATED);
    }

    @GetMapping(path = "/price/get/all")
    public ResponseEntity<List<PriceDto>> getAll() {
        List<Price> prices = priceService.getAll();
        List<PriceDto> priceDtos = prices.stream()
                .map(e -> priceToPriceDtoConverter.convert(e))
                .toList();

        return new ResponseEntity<>(priceDtos, HttpStatus.OK);
    }
}
