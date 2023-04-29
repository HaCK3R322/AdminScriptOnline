package com.androsov.adminscriptonline.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Grooming {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "breed_id")
    private Breed breed;
    @ManyToOne
    @JoinColumn(name = "price_id")
    private Price price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Grooming() {

    }
}
