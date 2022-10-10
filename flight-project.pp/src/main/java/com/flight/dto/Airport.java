package com.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airport {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long airportId;
    @Column(name="airportName")
    private String airportName;
    @Column(name="airportCode")
    private String airportCode;
    @Column (name="airportLocation")
    private String airportLocation;
    
    
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Airport(long airportId, String airportName, String airportCode, String airportLocation) {
		super();
		this.airportId = airportId;
		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
	}


	public long getAirportId() {
		return airportId;
	}


	public void setAirportId(long airportId) {
		this.airportId = airportId;
	}


	public String getAirportName() {
		return airportName;
	}


	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	public String getAirportCode() {
		return airportCode;
	}


	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}


	public String getAirportLocation() {
		return airportLocation;
	}


	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
    
    
    
}