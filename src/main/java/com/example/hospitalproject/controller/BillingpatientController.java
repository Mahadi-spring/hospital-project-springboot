package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.BillingPatient;
import com.example.hospitalproject.service.BillingPatientService;
import com.example.hospitalproject.service.PatientAdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billingpatient/")

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true" )
public class BillingpatientController {
    @Autowired
    BillingPatientService billingService;
    @Autowired
    PatientAdmissionService admissionService;


    @PostMapping("post")
    public void save (@RequestBody BillingPatient billingPatient){
        billingService.save(billingPatient);
    }

    @GetMapping("post/{id}")
    public BillingPatient getById(@PathVariable("id") Long id){
        return billingService.findPatientInfoById(id);
    }

    @PutMapping("post/{id}")
    public void update (@PathVariable("id") Long id, @RequestBody BillingPatient billingPatient){
        billingService.update(id, billingPatient);
    }
}
