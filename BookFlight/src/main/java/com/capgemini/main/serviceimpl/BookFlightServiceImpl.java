package com.capgemini.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.exception.NoDataFoundException;
import com.capgemini.main.model.Booking;
import com.capgemini.main.repository.BookFlightRepository;
import com.capgemini.main.service.BookFlightService;

@Service
public class BookFlightServiceImpl implements BookFlightService{
	
	@Autowired
	BookFlightRepository bookFlightRepository;

	@Override
	public Booking bookFlight(Booking booking) {
		
		return bookFlightRepository.save(booking);
	}

	@Override
	public String cancelBooking(int bookingId) {
		bookFlightRepository.deleteById(bookingId);
		return "Booking cancelled successfully ";
	}

	@Override
	public List<Booking> getFlightByBookingId(int bookingId) throws NoDataFoundException {
		Optional<Booking> findById = bookFlightRepository.findById(bookingId);
		  if(findById.isPresent()) {
			  bookFlightRepository.findAll();
		  }else {
			  throw new NoDataFoundException("No data found on id given");
		  }
		return bookFlightRepository.findAll();
	}

}
