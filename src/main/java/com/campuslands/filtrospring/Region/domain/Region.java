package com.campuslands.filtrospring.Region.domain;


import com.campuslands.filtrospring.Country.domain.Country;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Region {
    @Id
    private String codereg;

    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountry", referencedColumnName = "codecountry", nullable = true)
    private Country country;
}
