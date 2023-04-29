package com.androsov.adminscriptonline.repositories;

import com.androsov.adminscriptonline.entities.Master;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterRepository extends JpaRepository<Master, Long> {
}