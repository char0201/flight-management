package com.flight.service;

import java.util.List;

import com.flight.dto.Passenger;

public interface PassengerService {
	//Create:
		Passenger savePassenger(Passenger passenger);
		//Update:
		Passenger updatePassenger(Passenger passenger, long id);
		//Delete:
		void deletePassenger(long id);
		//Get all:
		List<Passenger> displayAllPassenger();
		//Get by id:
		Passenger findPassengerById(long id);
		

}
