package com.example.hospitalproject.service;


import com.example.hospitalproject.entity.Specialization;
import com.example.hospitalproject.repository.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationService {
    @Autowired
    SpecializationRepository specializationRepository;

    public List<Specialization> departmentList(){

        return specializationRepository.findAll();
    }
}
