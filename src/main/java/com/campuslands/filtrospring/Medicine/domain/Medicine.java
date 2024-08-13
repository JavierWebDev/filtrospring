package com.campuslands.filtrospring.Medicine.domain;

import com.campuslands.filtrospring.ActivePrinciple.domain.ActivePrinciple;
import com.campuslands.filtrospring.Laboratory.domain.Laboratory;
import com.campuslands.filtrospring.ModeAdministration.domain.ModeAdministration;
import com.campuslands.filtrospring.UnitMeasurement.domain.UnitMeasurement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String proceedings;

    private String namemedicine;

    private String healthregister;

    private String description;

    private String descriptionshort;

    @ManyToOne
    @JoinColumn(name = "codeap", referencedColumnName = "idap", nullable = true)
    private ActivePrinciple codeap;

    @ManyToOne
    @JoinColumn(name = "codeum", referencedColumnName = "idnum", nullable = true)
    private UnitMeasurement codeum;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin", referencedColumnName = "id", nullable = true)
    private ModeAdministration codemodeadmin;

    @ManyToOne
    @JoinColumn(name = "codelab", referencedColumnName = "id", nullable = true)
    private Laboratory codelab;
}
