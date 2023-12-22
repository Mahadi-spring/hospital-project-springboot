package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.PathologyPatient;
import com.example.hospitalproject.service.PathologyPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pathologypatient/")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PathologyPatientController {
    @Autowired
    PathologyPatientService pathologyPatientService;

    @PostMapping("post")
    public void createPathology(@RequestBody PathologyPatient pathologyPatient){
        System.out.println(pathologyPatient.toString());
        pathologyPatientService.savePathology(pathologyPatient);
    }
    @GetMapping("post")
    public  List<PathologyPatient> getPathology(){
      return   pathologyPatientService.pathologyPatientList();
    }
}
