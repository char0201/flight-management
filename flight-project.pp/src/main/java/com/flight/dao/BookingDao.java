package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.dto.Booking;

public interface BookingDao extends JpaRepository<Booking,Long> {

}
