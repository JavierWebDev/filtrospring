package com.campuslands.filtrospring.Farmacy.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.campuslands.filtrospring.Farmacy.domain.Farmacy;
import com.campuslands.filtrospring.Farmacy.infrastructure.persistence.out.FarmacyRepository;

public class FarmacyService {
    @Autowired
    FarmacyRepository farmacyRepository;

    public void create(Farmacy farmacy) {
        farmacyRepository.save(farmacy);
    }

    public List<Farmacy> listAll() {
        return farmacyRepository.findAll();
    }

    public Optional<Farmacy> listById(Long id) {
        return farmacyRepository.findById(id);
    }

    public void delete(Long id) {
        farmacyRepository.deleteById(id);
    }
}
