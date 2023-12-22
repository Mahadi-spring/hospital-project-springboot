package com.example.hospitalproject.repository;

import com.example.hospitalproject.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoinmentRepository extends JpaRepository<Appointment, Long> {
}
