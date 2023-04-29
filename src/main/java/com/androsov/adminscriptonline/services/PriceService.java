package com.androsov.adminscriptonline.services;

import com.androsov.adminscriptonline.entities.Breed;
import com.androsov.adminscriptonline.entities.Price;
import com.androsov.adminscriptonline.repositories.BreedRepository;
import com.androsov.adminscriptonline.repositories.PriceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {
    private PriceRepository priceRepository;
    public Price createPrice(Price priceToCreate) {
        return priceRepository.save(priceToCreate);
    }

    public List<Price> getAll() {
        return priceRepository.findAll();
    }
}
