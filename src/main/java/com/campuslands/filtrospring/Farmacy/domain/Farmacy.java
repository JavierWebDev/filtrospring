package com.campuslands.filtrospring.Farmacy.domain;

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
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfarmacy;

    private String namefarmacy;

    private String addressfarmacy;

    private Double longfarmacy;

    private Double latfarmacy;

    @ManyToOne
    @JoinColumn(referencedColumnName = "codecity", nullable = true)
    private City codecityfarm;

    private String logofarmacy;
}
