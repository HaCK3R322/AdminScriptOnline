package com.androsov.adminscriptonline.services;

import com.androsov.adminscriptonline.entities.Salon;
import com.androsov.adminscriptonline.repositories.SalonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SalonService {
    private SalonRepository salonRepository;

    public Salon createSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    public List<Salon> getAll() {
        return salonRepository.findAll();
    }
}
