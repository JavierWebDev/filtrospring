package com.campuslands.filtrospring.Farmacy.infrastructure.persistence.in;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.filtrospring.Farmacy.application.FarmacyService;
import com.campuslands.filtrospring.Farmacy.domain.Farmacy;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/farmacy")
public class FarmacyController {
    @Autowired
    FarmacyService farmacyService;

    @GetMapping
    public List<Farmacy> getFarmacies() {
        return farmacyService.listAll();
    }

    @GetMapping("/{id}")
    public Optional<Farmacy> getFarmacyById(@PathVariable Long id) {
        return farmacyService.listById(id);
    }

    @PostMapping
    public void create(@RequestBody Farmacy farmacy) {
        farmacyService.create(farmacy);;
    }
    
    @PutMapping("/{id}")
    public void updateFarmacy(@PathVariable Long id, @RequestBody Farmacy farmacy) {
        farmacy.setIdfarmacy(id);
        farmacyService.create(farmacy);
    }
    
    @DeleteMapping("/{id}")
    public void deleteFarmacy(@PathVariable Long id) {
        farmacyService.delete(id);
    }
}