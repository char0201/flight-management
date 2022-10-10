package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.PassengerDao;
import com.flight.dto.Passenger;
import com.flight.exception.DataNotFoundException;

@Service

public class PassengerServiceImpl implements PassengerService{
	private PassengerDao passengerDao;
	public PassengerServiceImpl(PassengerDao passengerDao) {
		super();
		this.passengerDao = passengerDao;
	}

	//Create:
	@Override
	public Passenger savePassenger(Passenger passenger) {
		return passengerDao.save(passenger);
	}
	
	//Update:
	@Override
	public Passenger updatePassenger(Passenger passenger, long id) {
		Passenger existingPassenger = passengerDao.findById(id).orElseThrow( ()->
		new DataNotFoundException("Passenger" , "ID", id));
		existingPassenger.setPassengerName(passenger.getPassengerName());
		existingPassenger.setPassengerAge(passenger.getPassengerAge());
		existingPassenger.setPassengerUIN(passenger.getPassengerUIN());
		existingPassenger.setLuggage(passenger.getLuggage());
		passengerDao.save(existingPassenger);
		return existingPassenger;
	}

	//Delete:
	@Override
	public void deletePassenger(long id) {
		passengerDao.findById(id).orElseThrow( ()->
		new DataNotFoundException("Passenger", "ID" , id));
		passengerDao.deleteById(id);
	}

	//Get all:
	@Override
	public List<Passenger> displayAllPassenger() {
		return passengerDao.findAll();
	}
	
	//Get by id:
	@Override
	public Passenger findPassengerById(long id) {
		return passengerDao.findById(id).orElseThrow( ()->
		new DataNotFoundException("Passenger", "ID" , id));
	}


}
