package com.example.hospitalproject.repository;

import com.example.hospitalproject.entity.PathologyList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PathologyListNameRepository extends JpaRepository<PathologyList, Integer> {

    @Query(value = "SELECT amount FROM hospitaldb.pathology_list where lab_test_name = ? ;", nativeQuery = true)
     Integer totalTestAmount(String labtestName);
}
