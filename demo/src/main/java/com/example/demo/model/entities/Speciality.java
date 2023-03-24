package com.example.demo.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "specialities")
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public Speciality setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Speciality setName(String name) {
        this.name = name;
        return this;
    }
}
