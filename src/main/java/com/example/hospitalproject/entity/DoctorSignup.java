package com.example.hospitalproject.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@RequiredArgsConstructor
@Data
@ToString
public class DoctorSignup extends BaseEntity {
    String doctorName, email, phone,
    userName, department,
    password;

    String doctorImage;
}
