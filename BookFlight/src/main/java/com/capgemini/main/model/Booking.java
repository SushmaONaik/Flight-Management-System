package com.capgemini.main.model;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking {
	
	@Id
	private int bookingId;
	private String passengerMailId;
	private long mobileNumber;
	private String passengerName;
	private int passengerAge;
	private Date departureDate;
	private LocalDate bookingDate;
	private Flight flight;
	public Booking() {
		super();
	}
	public Booking(int bookingId, String passengerMailId, long mobileNumber, String passengerName, int passengerAge,
			Date departureDate, LocalDate bookingDate, Flight flight) {
		super();
		this.bookingId = bookingId;
		this.passengerMailId = passengerMailId;
		this.mobileNumber = mobileNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.departureDate = departureDate;
		this.bookingDate = bookingDate;
		this.flight = flight;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getPassengerMailId() {
		return passengerMailId;
	}
	public void setPassengerMailId(String passengerMailId) {
		this.passengerMailId = passengerMailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", passengerMailId=" + passengerMailId + ", mobileNumber="
				+ mobileNumber + ", passengerName=" + passengerName + ", passengerAge=" + passengerAge
				+ ", departureDate=" + departureDate + ", bookingDate=" + bookingDate + ", flight=" + flight + "]";
	}
	
	
	
	
	
	
}
