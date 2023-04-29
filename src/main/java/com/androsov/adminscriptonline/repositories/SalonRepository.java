package com.androsov.adminscriptonline.repositories;

import com.androsov.adminscriptonline.entities.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepository extends JpaRepository<Salon, Long> {
    Salon findByName(String name);
}