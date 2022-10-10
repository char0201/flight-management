package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.dto.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Long> {

}
