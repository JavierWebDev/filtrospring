package com.campuslands.filtrospring.Farmacy.infrastructure.persistence.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.filtrospring.Farmacy.domain.Farmacy;

@Repository
public interface FarmacyRepository extends JpaRepository<Farmacy, Long>{

}
