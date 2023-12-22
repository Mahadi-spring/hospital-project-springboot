package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.Cabin;
import com.example.hospitalproject.service.CabinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200/", allowCredentials = "true" )
public class CabinController {
    @Autowired
    CabinService cabinService;

    @GetMapping("/cabintype")
    List<Cabin>cabinList(){
        return cabinService.listOfCabin();
    }
    @GetMapping ("/room")
    List<Cabin>getAllRooms(@RequestParam(value = "cabintype", required = false ) String cabintype){
        return cabinService.listOfRoom(cabintype);}

//    @GetMapping ("/roomprice")
//    List<Object>getRoomPrice(){
//        return cabinService.priceList();}

}
