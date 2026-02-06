package com.travel.onlinetravel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.onlinetravel.model.TravelPackage;
import com.travel.onlinetravel.repository.TravelPackageRepository;

@Service
public class TravelPackageService {

    private final TravelPackageRepository repository;

    public TravelPackageService(TravelPackageRepository repository) {
        this.repository = repository;
    }

    public List<TravelPackage> getAllPackages() {
        return repository.findAll();
    }

    public void save(TravelPackage pkg) {
        repository.save(pkg);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
