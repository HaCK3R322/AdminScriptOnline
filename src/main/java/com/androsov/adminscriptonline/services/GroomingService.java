package com.androsov.adminscriptonline.services;

import com.androsov.adminscriptonline.entities.Grooming;
import com.androsov.adminscriptonline.repositories.GroomingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroomingService {
    private GroomingRepository groomingRepository;

    public Grooming createGrooming(Grooming grooming) {
        return groomingRepository.save(grooming);
    }

    public List<Grooming> getAll() {
        return groomingRepository.findAll();
    }
}
