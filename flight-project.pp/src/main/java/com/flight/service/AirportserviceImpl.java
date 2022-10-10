package com.flight.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.AirportDao;
import com.flight.dto.Airport;
import com.flight.exception.FlightNotAvailableException;


@Service
public class AirportserviceImpl implements Airportservice {
private AirportDao airportDao;
	public AirportserviceImpl(AirportDao airportDao) {
		super();
		this.airportDao = airportDao;
	}
//get all:
	@Override
	public List<Airport> getAllAirport() {
		// TODO Auto-generated method stub
		return airportDao.findAll();
	}
	//create:
	@Override
	public Airport saveAirport(Airport airport) {
		return airportDao.save(airport);
	}
	//get by id:
     @Override
	public  Airport getAirportById(long airportId) {
		
		return airportDao.findById(airportId).orElseThrow(()->
		new FlightNotAvailableException("Airport","id",airportId ));
		}

	

}
