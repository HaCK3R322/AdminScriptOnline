package com.androsov.adminscriptonline.repositories;

import com.androsov.adminscriptonline.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
    Price findByTime(Float time);
}