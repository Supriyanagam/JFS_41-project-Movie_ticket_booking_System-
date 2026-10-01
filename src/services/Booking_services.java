package services;

import java.util.ArrayList;


import modules.Bookings;
//import modules.Customer;
import modules.Movies;
import modules.Shows;
import modules.Theatres;

public class Booking_services {
	private ArrayList<Bookings> bookingsList = new ArrayList<>();
	private int bookingCounter = 0;
	public void bookTickets( Movies movie,Theatres theatre,Shows show,int noofTickets,float total_amount) {
		if(show.getAvailableTickets()<noofTickets) {
			System.out.println(noofTickets+ " weren't available");
			return;
		}
		
		
		//updating available tickets count
		show.setAvailableTickets(show.getAvailableTickets()-noofTickets);
		
		//adding bookings
		Bookings booking = new Bookings(bookingCounter++,movie,theatre,show,noofTickets,total_amount);
		bookingsList.add(booking);
		System.out.println(booking);
	}
	//search bookings
	
	public Bookings searchBooking(int bookingid){
		for(Bookings booking : bookingsList) {
			if(bookingid == booking.getBookingId()) {
				return booking;
			}
			
		}
		return null;
	}
	//cancel bookings
	public void cancelBooking(int bookingid) {
		Bookings booking = searchBooking(bookingid);
		if(booking != null) {
			Shows show = booking.getShow();
			show.setAvailableTickets(show.getAvailableTickets()-booking.getNoofTickets());
			bookingsList.remove(booking);
			System.out.println("Booking has been cancel successfull");
		}
	}
	//display all the bookings
	public void viewAllBookings() {
		if(bookingsList.isEmpty()) {
			System.out.println("No bookings avaialable");
			return;
		}else {
			for(Bookings booking: bookingsList) {
				System.out.println(booking);
			}
		}
	}
	//total bookings
	public int totalBookings() {
		return bookingsList.size();
	}
	

}
