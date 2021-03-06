package com.flightapp.flights.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.flights.model.Flight;
import com.flightapp.flights.repository.FlightRepository;

@Service
public class FlightService 
{
	@Autowired
	private FlightRepository flightRepo;
	
	
//	Create Flight
	
	public void createNewFlight(Flight flight)
	{
		this.flightRepo.save(flight);
	}
	

//	Get All Flight
	
	public List<Flight> getAllFlight()
	{
		return this.flightRepo.findAll();
	}
	
	
//	get Single Flight
	
	public Flight getSingleFlight(String id)
	{
		Flight flight = this.flightRepo.findByFlightNumber(id);
		if(flight==null)
		{
			throw new NoSuchElementException("Flight is not present with given Id");
		}
		
		return flight;
	}
	

//	update flight
	
	public void updateFlight(Flight flight)
	{
		List<Flight> flights = this.flightRepo.findAll();
		
		List<Flight> updatedFlights = flights.stream().map(e->{
			if(e.getFlightNumber().equals(flight.getFlightNumber()))
			{
				e.setFlightAirline(flight.getFlightAirline());
				e.setFlightTime(flight.getFlightTime());
				e.setMeal(flight.getMeal());
				e.setScheduleDays(flight.getScheduleDays());
				e.setTicketCost(flight.getTicketCost());
			}
			return e;
		}).collect(Collectors.toList());
		
		this.flightRepo.saveAll(updatedFlights);
	}

	
//	Delete flight
	
	public void delteFlight(String id)
	{
		Flight flight = this.flightRepo.findByFlightNumber(id);
		if(flight!=null)
		{
			this.flightRepo.delete(flight);
		}
		else
		{
			throw new NoSuchElementException("No flight flound");
		}
	}


}

