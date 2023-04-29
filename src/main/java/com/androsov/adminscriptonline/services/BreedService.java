package com.androsov.adminscriptonline.services;

import com.androsov.adminscriptonline.entities.Breed;
import com.androsov.adminscriptonline.repositories.BreedRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BreedService {


    private BreedRepository breedRepository;
    public Breed createBreed(Breed breedToCreate) {
        return breedRepository.save(breedToCreate);
    }

    public List<Breed> getAll() {
        return breedRepository.findAll();
    }
}
