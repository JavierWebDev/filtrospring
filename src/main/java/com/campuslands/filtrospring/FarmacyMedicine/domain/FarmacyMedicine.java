package com.campuslands.filtrospring.FarmacyMedicine.domain;

import com.campuslands.filtrospring.Farmacy.domain.Farmacy;
import com.campuslands.filtrospring.Medicine.domain.Medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class FarmacyMedicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfarmacymedicine;

    @ManyToOne
    @JoinColumn(name = "idfarmacy", referencedColumnName = "idfarmacy", nullable = true)
    private Farmacy idfarmacy;

    @ManyToOne
    @JoinColumn(name = "idmedicinefatrm", referencedColumnName = "id", nullable = true)
    private Medicine idmedicinefatrm;

    private Double price;
}
