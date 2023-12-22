package com.example.hospitalproject.repository;

import com.example.hospitalproject.entity.Cabin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CabinRepository extends JpaRepository<Cabin,Long > {
    @Query(value = "SELECT distinct (cabin_type) from hospitaldb.cabin ", nativeQuery = true)
    List<Object> listOfCabin();

//    @Query(value = "SELECT room_number FROM hospitaldb.cabin", nativeQuery = true)
//    List<Cabin> listOfRoom();

    @Query(value = "SELECT distinct(price) FROM hospitaldb.cabin", nativeQuery = true)
    List<Object> priceList();


    @Query(value = "SELECT * FROM cabin where cabin_type = :cabinType and status = true", nativeQuery = true)
    List<Cabin> getAllByCabinType(@Param(value = "cabinType") String cabinType);

    @Query(value = "SELECT * FROM cabin where room_number = :roomNumber and status = :status", nativeQuery = true)
    Cabin findByRoomNumber(@Param( "roomNumber") String roomNumber, @Param( "status") Boolean status);


    @Query(value = "SELECT * FROM cabin where room_number = :roomNumber ", nativeQuery = true)
    Cabin findByRoomNumber2(@Param( "roomNumber") String roomNumber);
}
