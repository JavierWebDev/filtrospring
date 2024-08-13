package com.campuslands.filtrospring.City.domain;

import com.campuslands.filtrospring.Region.domain.Region;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class City {
    @Id
    private String codecity;

    private String namecity;

    @ManyToOne
    @JoinColumn(name = "codereg", referencedColumnName = "codereg", nullable = true)
    private Region codereg;
}
