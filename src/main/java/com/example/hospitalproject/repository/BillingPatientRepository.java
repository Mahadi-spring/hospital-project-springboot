package com.example.hospitalproject.repository;

import com.example.hospitalproject.entity.BillingPatient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingPatientRepository extends JpaRepository<BillingPatient, Long> {
}
