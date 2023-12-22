package com.example.hospitalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class  BillingPatient extends BaseEntity {

    @Id
    private Long id;
    String patientName, patientPhone, gender,
            patientAddress, doctorName, department,
            cabinType, roomNumber, description,
            doctorVisit, visitDate, patientCase, medicine, surgeryDetails;


    Long age, cabinPrice, stayingDays, bedBill, total, discount,
            doctorCharge, medicinePrice, surgeryCost;

    LocalDateTime admissionDate, releaseDate;


}
