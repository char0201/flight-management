package com.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//create a data base with a class
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookingId;
	
	@Column(name="bookingdate")
	private String bookingdate;
	
	@Column(name="ticketCost")
	private Double ticketCost;
	
	@Column(name="NoOfPassenger")
	private int NoOfPassenger;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public Double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getNoOfPassenger() {
		return NoOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		NoOfPassenger = noOfPassenger;
	}

}
