package com.androsov.adminscriptonline.repositories;

import com.androsov.adminscriptonline.entities.Grooming;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroomingRepository extends JpaRepository<Grooming, Long> {
}