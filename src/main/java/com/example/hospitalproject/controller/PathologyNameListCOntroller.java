package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.PathologyList;
import com.example.hospitalproject.service.PathologyListNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins ="http://localhost:4200", allowCredentials = "true" )
public class PathologyNameListCOntroller {
    @Autowired
    PathologyListNameService listNameService;

    @GetMapping("/pathologylist")
    List<PathologyList> getAllLabTestNames(){
        return listNameService.pathologyLists();
    }

    @GetMapping("/totalAmount/{labTestName}")
    Integer getTotalTestAmount(@PathVariable String labTestName){
        return listNameService.listofTestAmount(labTestName);
    }
}
