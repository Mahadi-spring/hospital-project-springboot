package com.example.hospitalproject.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@ToString
@RequiredArgsConstructor
public class Appointment extends BaseEntity{
    private String patientName,
            patientPhone, patientAddress,
            gender, age,
            doctorName, department,
            appointmentDate, status,
            recommendation;
}
