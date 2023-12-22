package com.example.hospitalproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cabin {
    @Id
    private Long id;
    private Long price;
    private String roomNumber;
    private String cabinType;
    private Boolean status;
}
