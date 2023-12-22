package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.PatientAdmission;
import com.example.hospitalproject.service.PatientAdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patientadmission/")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PatientAdmissionCOntroller {
    @Autowired
    PatientAdmissionService admissionService;

    @PostMapping("post")
    public void save(@RequestBody PatientAdmission admission){admissionService.save(admission);}

    @GetMapping("post")
    List<PatientAdmission> listofAdmittedPatient(){return admissionService.patientAdmissionList();}

    @DeleteMapping("post/{id}")
    public void delete(@PathVariable("id") Long id){admissionService.delete(id);}

    @GetMapping("post/{id}")
    public PatientAdmission getById(@PathVariable("id") Long id) {return admissionService.findadmissionInfoById(id);}

    @PutMapping("post/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody PatientAdmission admission){
        admissionService.update(id, admission);
    }
}
