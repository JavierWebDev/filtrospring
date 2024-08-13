package com.campuslands.filtrospring.Laboratory.domain;

import com.campuslands.filtrospring.City.domain.City;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecitylab", referencedColumnName = "codecity", nullable = true)
    private City citycustomer;
}
