package com.capgemini.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.model.Flight;
import com.capgemini.main.repository.AdminRepository;
import com.capgemini.main.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Flight addFlight(Flight flight) {
		
		return adminRepository.save(flight);
	}

	@Override
	public Flight updateFlight(int flightId, Flight flight) {
		Optional<Flight> findById = adminRepository.findById(flightId);
		if(findById.isPresent()) {
			Flight flightModel = findById.get();
			if(flight.getFlightName()!=null && !flight.getFlightName().isEmpty())
				flightModel.setFlightName(flight.getFlightName());
			if(flight.getFlightFrom()!=null && !flight.getFlightFrom().isEmpty())
				flightModel.setFlightFrom(flight.getFlightFrom());
			if(flight.getFlightTo()!=null && !flight.getFlightTo().isEmpty())
				flightModel.setFlightTo(flight.getFlightTo());
			if(flight.getArrivesAtTime()!=null && !flight.getArrivesAtTime().isEmpty())
				flightModel.setArrivesAtTime(flight.getArrivesAtTime());
			if(flight.getReachesAtTime()!=null && !flight.getReachesAtTime().isEmpty())
				flightModel.setReachesAtTime(flight.getReachesAtTime());
			return adminRepository.save(flightModel);
		}
		return null;
	}

	@Override
	public List<Flight> getAllFlight() {
		
		return adminRepository.findAll();
	}

	@Override
	public String deleteFlight(int flightId) {
		adminRepository.deleteById(flightId);
		return "deleted successfully";
	}
	
	

}
