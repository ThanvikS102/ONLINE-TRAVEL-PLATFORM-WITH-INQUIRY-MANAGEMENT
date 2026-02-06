package com.travel.onlinetravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.onlinetravel.model.TravelPackage;
import com.travel.onlinetravel.service.TravelPackageService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final TravelPackageService service;

    public AdminController(TravelPackageService service) {
        this.service = service;
    }

    @GetMapping
    public String admin(Model model) {
        model.addAttribute("packages", service.getAllPackages());
        return "admin-inquiries";
    }

    @PostMapping("/add")
    public String add(TravelPackage pkg) {
        service.save(pkg);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin";
    }
}
