package com.flight.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.Flight;
import com.flight.service.FlightService;
//rest controller coverts into web applications
@RestController//
//@RequestMapping is the most common and widely used annotation in Spring MVC. It is used to map web requests onto specific handler classes and/or handler methods.
@RequestMapping("/flight")//mapping to request data

public class FlightController {
	private FlightService flightServiceimpl;

	public FlightController(FlightService flightServiceimpl) {
		super();
		this.flightServiceimpl = flightServiceimpl;
	}
	//creating a data
	//@ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
	//it creates new resource
	@PostMapping
	public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight){
		return new  ResponseEntity<Flight> (flightServiceimpl.saveFlight(flight),HttpStatus.CREATED);
		
	}
     //display the particular data
	// @PathVariable is a Spring annotation which indicates that a method parameter should be bound to a URI template variable.
	//Getmethod -> it reads a resource
	@GetMapping("{id}")
	public  ResponseEntity<Flight>  getFlightById(@PathVariable("id") Long flightId ,@RequestBody Flight flight){
		return new  ResponseEntity<Flight>(flightServiceimpl.getFlightById(flightId),HttpStatus.OK);
		
	}
	//get the all data
	@GetMapping
	public  List<Flight> getAllFlight(){
		return flightServiceimpl.getAllFlight();
		
	}
	//updating
	//it updates resource
	@PutMapping("{id}")
	public ResponseEntity<Flight> updateFlight(@PathVariable("id") long flightId,@RequestBody Flight flight){
		return new ResponseEntity<Flight>(flightServiceimpl.updateFlight(flight,flightId),HttpStatus.OK);
	}
	//deleting the data
	//it deletes resource
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable("id") long flightId){
		flightServiceimpl.deleteFlight(flightId);
		return new ResponseEntity<String>("Flight Successfully!!!",HttpStatus.OK);
	}


}
