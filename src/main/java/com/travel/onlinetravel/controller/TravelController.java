package com.travel.onlinetravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.travel.onlinetravel.service.TravelPackageService;

@Controller
public class TravelController {

    private final TravelPackageService service;

    public TravelController(TravelPackageService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("packages", service.getAllPackages());
        return "index";
    }

    @GetMapping("/packages")
    public String packages(Model model) {
        model.addAttribute("packages", service.getAllPackages());
        return "packages";
    }
}
