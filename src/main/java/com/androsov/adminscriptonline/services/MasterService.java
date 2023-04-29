package com.androsov.adminscriptonline.services;

import com.androsov.adminscriptonline.entities.Master;
import com.androsov.adminscriptonline.repositories.MasterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MasterService {
    private MasterRepository masterRepository;

    public Master createMaster(Master master) {
        return masterRepository.save(master);
    }

    public List<Master> getAll() {
        return masterRepository.findAll();
    }
}
