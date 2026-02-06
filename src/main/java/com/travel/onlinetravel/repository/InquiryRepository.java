package com.travel.onlinetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.onlinetravel.model.Inquiry;

public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}
