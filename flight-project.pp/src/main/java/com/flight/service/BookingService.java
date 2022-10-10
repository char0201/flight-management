package com.flight.service;

import java.util.List;

import com.flight.dto.Booking;

public interface BookingService {
	//save the booking slot
		public Booking saveBooking(Booking booking);
		//Getting by id:
		Booking getBookingById(long bookingid);
		//Get all:
		List<Booking> displayAllBooking();
		//Update:
		Booking updatebooking (Booking booking, long bookingid);
		//Delete:
		void deleteBooking (long bookingid);

}
