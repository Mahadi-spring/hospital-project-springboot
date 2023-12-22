package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.Appointment;
import com.example.hospitalproject.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/appointment/")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("post")
    public void save(@RequestBody Appointment appointment){
        appointmentService.save(appointment);
    }

    @GetMapping("post")
    List<Appointment> listOfAppointment(){
        return appointmentService.appointmentList();
    }

    @DeleteMapping("post/{id}")
    public void delete (@PathVariable("id") Long id){
        appointmentService.delete(id);
    }

    @GetMapping("post/{id}")

    public Appointment getById(@PathVariable("id") Long id){
        return appointmentService.findAppointmentById(id);
    }

    @PutMapping("post/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Appointment appointment){
//      appointment.setId(id);
        appointmentService.update(id, appointment);
    }
}
