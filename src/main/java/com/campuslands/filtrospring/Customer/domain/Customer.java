package com.campuslands.filtrospring.Customer.domain;

import java.time.LocalDate;

import com.campuslands.filtrospring.City.domain.City;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    private String idcustomer;

    private String namecustomer;

    private String lastnamecustomer;

    private String emailcustomer;

    private LocalDate birthdate;

    private Long lon;

    private Long latitud;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer", referencedColumnName = "codecity", nullable = true)
    private City citycustomer;
}
