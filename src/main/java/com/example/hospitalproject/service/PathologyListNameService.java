package com.example.hospitalproject.service;

import com.example.hospitalproject.entity.PathologyList;
import com.example.hospitalproject.repository.PathologyListNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PathologyListNameService {
    @Autowired
    PathologyListNameRepository listNameRepository;
    public List<PathologyList>pathologyLists(){
        return listNameRepository.findAll();
    }


    public Integer listofTestAmount(String labTestName){
        return listNameRepository.totalTestAmount(labTestName);
    }
}
