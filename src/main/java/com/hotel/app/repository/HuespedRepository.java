package com.hotel.app.repository;


import com.hotel.app.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HuespedRepository extends JpaRepository <Huesped, Long> {


}
