package com.campuslands.filtrospring.Country.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Country {
    @Id
    private String codecountry;

    @Column
    private String namecountry;
}
