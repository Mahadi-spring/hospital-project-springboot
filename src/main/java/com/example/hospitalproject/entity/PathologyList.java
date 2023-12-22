package com.example.hospitalproject.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@Data
public class PathologyList {
    @Id
    private Integer id;
    private String labTestName;
    private Integer amount;
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pathologyLists")
//    @ToString.Exclude
//
//    private Set<PathologyPatient> pathologyPatients;



//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "pathologyPatient_pathologyList",
//            joinColumns = { @JoinColumn(name = "pathologyList_id") },
//            inverseJoinColumns = { @JoinColumn(name = "pathologyPatient_id") })
//    private Set<PathologyPatient> pathologyPatients = new HashSet<>();


//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Collection<PathologyPatient> pathologyPatients ;

}
