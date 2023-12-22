package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.Specialization;
import com.example.hospitalproject.service.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/specialization/")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")

public class SpecializationController {
    @Autowired
    SpecializationService specializationService;

    @GetMapping("departmentlist")
    List<Specialization> listOfDepartments(){

        return specializationService.departmentList();
    }
}
