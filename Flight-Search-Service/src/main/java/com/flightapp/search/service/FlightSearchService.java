package com.flightapp.search.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.search.model.FlightSchedule;
import com.flightapp.search.repository.FlightSearchRepository;

@Service
public class FlightSearchService 
{
	@Autowired
	private FlightSearchRepository searchRepo;
	
// Search Flight	
	
	public List<FlightSchedule> serchFlight(String to, String from, String date, String returnDate) throws NoSuchElementException
	{
		List<FlightSchedule> flights = new ArrayList<>();
					
		List<FlightSchedule> returnFlights = new ArrayList<>();
				
		if(returnDate==null)
		{
			flights = this.searchRepo.findAllByToPlaceAndFromPlaceAndFlightDate(to, from, date);
			
			if(flights.size()==0)
			{
				throw new NoSuchElementException("No Flights");
			}
		}
		else if(returnDate!=null)
		{
			flights = this.searchRepo.findAllByToPlaceAndFromPlaceAndFlightDate(to, from, date);
			
			returnFlights = this.searchRepo.findAllByToPlaceAndFromPlaceAndFlightDate(from, to, returnDate);
			
			if(flights.size()==0)
			{
				throw new NoSuchElementException("No Flights");
			}
			
			for(FlightSchedule f : returnFlights)
			{
				flights.add(f);
			}
			
		}
		
		return flights;
	}
	
	
	
//	Flight by its Id
	
	public FlightSchedule serchSingleFlight(int id)
	{
		return this.searchRepo.findById(id).orElseThrow(()-> new NoSuchElementException("Flight not found with given Id"));
	}



	public List<FlightSchedule> findFligh(String toPlace) 
	{
		List<FlightSchedule> allFlights = this.searchRepo.findAllByToPlace(toPlace);
		return allFlights;
	}

}
