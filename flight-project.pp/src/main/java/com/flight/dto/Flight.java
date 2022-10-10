package com.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//creating a database with class
public class Flight {
	//data members
	@Id //primary key
    @GeneratedValue(strategy=GenerationType.AUTO)//id generate
    private long flightId;
    @Column(name ="flightModel")//to create a column name
    private String flightModel;
    @Column(name ="carrierName")
    private String carrierName;
    @Column(name ="seatCapacity")
    private int seatCapacity;
    
//  default constructor //
    public Flight() {
        super();
        
    }
//    parameterized constructor//object will create
    public Flight(long flightId, String flightModel, String carrierName, int seatCapacity) {
        super();
        this.flightId = flightId;
        this.flightModel = flightModel;
        this.carrierName = carrierName;
        this.seatCapacity = seatCapacity;
    }
//    getters and setters  //it will get the value and it  will sent
    public long getFlightId() {
        return flightId;
    }
    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }
    public String getFlightModel() {
        return flightModel;
    }
    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }
    public String getCarrierName() {
        return carrierName;
    }
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

}
