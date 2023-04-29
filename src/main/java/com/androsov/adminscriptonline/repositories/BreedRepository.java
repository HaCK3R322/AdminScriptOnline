package com.androsov.adminscriptonline.repositories;

import com.androsov.adminscriptonline.entities.Breed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<Breed, Long> {
    Breed findByName(String name);
}