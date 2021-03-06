package com.flightapp.search.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.search.model.FlightSchedule;
import com.flightapp.search.service.FlightSearchService;

@RestController
@RequestMapping("/api/v1.0/user")
public class FlightSearchController 
{
	@Autowired
	private FlightSearchService search;


//  Search Flights
	
	@GetMapping("/flight/search")
	public ResponseEntity<?> searchForFlight(@RequestBody FlightSchedule flight) throws NoSuchElementException
	{
		List<FlightSchedule> flights = this.search.serchFlight(flight.getToPlace(), flight.getFromPlace(), flight.getFlightDate(), flight.getReturnDate());
		return ResponseEntity.ok(flights);
	}
	
//	Test Flight
	
	@GetMapping("/flight/test/search/{toPlace}")
	public ResponseEntity<?> searchTheFLight(@PathVariable String toPlace)
	{
		List<FlightSchedule> fl = this.search.findFligh(toPlace);
		return ResponseEntity.ok(fl);
	}
	
//	Get Single Filght
	
	@GetMapping("/flight/search/{id}")
	public ResponseEntity<?> serchSingleFlight(@PathVariable int id)
	{
		FlightSchedule flight = this.search.serchSingleFlight(id);
		return ResponseEntity.ok(flight);
	}
}
