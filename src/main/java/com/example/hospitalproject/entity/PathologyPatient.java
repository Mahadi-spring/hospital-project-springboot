package com.example.hospitalproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@ToString
@RequiredArgsConstructor
public class PathologyPatient extends BaseEntity {
   private String patientName, patientPhone,
    refferedBy, gender, age,
     testDate, resultDate;

   private String[] labTest;
   private Integer total;



//   @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//   @ToString.Exclude
//
//   private Set<PathologyList> pathologyLists;




//   @ManyToMany(fetch = FetchType.LAZY,
//           cascade = {
//                   CascadeType.PERSIST,
//                   CascadeType.MERGE
//           },
//           mappedBy = "pathologyPatients")
//   @JsonIgnore
//   private Set<PathologyList> pathologyLists = new HashSet<>();

   @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   private Collection<PathologyList> pathologyLists;
}
