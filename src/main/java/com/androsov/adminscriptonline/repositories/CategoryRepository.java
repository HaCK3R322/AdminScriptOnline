package com.androsov.adminscriptonline.repositories;

import com.androsov.adminscriptonline.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByLevel(Integer level);
}