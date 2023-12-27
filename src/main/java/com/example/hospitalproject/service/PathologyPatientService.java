package com.example.hospitalproject.service;

import com.example.hospitalproject.entity.PathologyList;
import com.example.hospitalproject.entity.PathologyPatient;
import com.example.hospitalproject.exception.UserNotFoundException;
import com.example.hospitalproject.repository.PathologyListNameRepository;
import com.example.hospitalproject.repository.PathologyPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PathologyPatientService {
    @Autowired
    private PathologyPatientRepository pathologyPatientRepository;

    @Autowired
    PathologyListNameRepository pathologyListNameRepository;
     public List<PathologyPatient> pathologyPatientList(){
        return pathologyPatientRepository.findAll();
    }

//    public PathologyPatient[] getallPathologyList(){
//        List<PathologyPatient> pathologyList = pathologyPatientRepository.findAll();
//        return pathologyList.toArray(new PathologyPatient[0]);
//    }

    public void savePathology(PathologyPatient pathologyPatient){

        Collection<PathologyList> pathologyLists = pathologyPatient.getPathologyLists();
        List<PathologyList> pathologyLists2 = new ArrayList<>();

        pathologyLists.forEach(pathologyList -> {
            PathologyList pathologyList1 = pathologyListNameRepository.findById(pathologyList.getId()).get();
            pathologyLists2.add(pathologyList1);
        });
        pathologyPatient.setPathologyLists(pathologyLists2);

        pathologyPatientRepository.save(pathologyPatient);
    }

    public void updatePathology(Long id, PathologyPatient pathologyPatient){
        pathologyPatientRepository.findById(id).map(
            old ->{
                old.setPatientName(pathologyPatient.getPatientName());
                old.setPatientPhone(pathologyPatient.getPatientPhone());
                old.setRefferedBy(pathologyPatient.getRefferedBy());
                old.setAge(pathologyPatient.getAge());
                old.setGender(pathologyPatient.getGender());
                old.setLabTest(pathologyPatient.getLabTest());
                old.setTestDate(pathologyPatient.getTestDate());
                old.setResultDate(pathologyPatient.getResultDate());
                return pathologyPatientRepository.save(pathologyPatient);
            })
                .orElseGet(()->{
                    return pathologyPatientRepository.save(pathologyPatient);
                });
    }

    public PathologyPatient findPathologyById(Long id){
        return pathologyPatientRepository.findById(id).
                orElseThrow(() -> new UserNotFoundException("this item was not found by this id"));
    }

    public void deletePathology(Long id){
        pathologyPatientRepository.deleteById(id);
    }
}


