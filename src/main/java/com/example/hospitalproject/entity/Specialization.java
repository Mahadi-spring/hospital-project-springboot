package com.example.hospitalproject.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@Data
public class Specialization {
    @Id
    private Integer id;
    private String specialized;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="specialization_id")
    private Set<DoctorSignup> listOfDoctors;
}
