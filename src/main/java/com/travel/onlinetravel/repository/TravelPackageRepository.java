package com.travel.onlinetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.onlinetravel.model.TravelPackage;

public interface TravelPackageRepository extends JpaRepository<TravelPackage, Long> {
}
