package com.androsov.adminscriptonline.dto;

import com.androsov.adminscriptonline.entities.Category;
import com.androsov.adminscriptonline.entities.Salon;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class MasterDto {
    private String name;

    private String surname;

    private String patronymic;

    private String phone;

    private Integer categoryLevel;
    private String salonName;
}
