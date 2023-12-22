package com.example.hospitalproject.repository;

import com.example.hospitalproject.entity.DoctorSignup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorSignupRepository extends JpaRepository<DoctorSignup, Long> {


    List<DoctorSignup> getDoctorsByDepartment(String dep);
}
