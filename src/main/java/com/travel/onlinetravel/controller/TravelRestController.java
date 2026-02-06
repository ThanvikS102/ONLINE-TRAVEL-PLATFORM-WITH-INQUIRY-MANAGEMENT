package com.travel.onlinetravel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.onlinetravel.model.TravelPackage;
import com.travel.onlinetravel.service.TravelPackageService;

@RestController
@RequestMapping("/api/packages")
public class TravelRestController {

    private final TravelPackageService service;

    public TravelRestController(TravelPackageService service) {
        this.service = service;
    }

    @GetMapping
    public List<TravelPackage> all() {
        return service.getAllPackages();
    }
}
