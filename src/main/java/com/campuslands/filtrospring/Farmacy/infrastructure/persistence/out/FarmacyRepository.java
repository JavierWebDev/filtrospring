package com.campuslands.filtrospring.Farmacy.infrastructure.persistence.out;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campuslands.filtrospring.Farmacy.domain.Farmacy;

public interface FarmacyRepository extends JpaRepository<Farmacy, Long>{

}
