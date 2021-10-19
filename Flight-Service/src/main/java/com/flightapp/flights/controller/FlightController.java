package com.flightapp.flights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.flights.model.Flight;
import com.flightapp.flights.service.FlightService;

@RestController
@RequestMapping("/api/v1.0/admin/airline")
class FlightController 
{
	@Autowired
	private FlightService flightService;
	
	
//	create Flight
	
	@PostMapping("/register")
	public ResponseEntity<?> addFlight(@RequestBody Flight flight)
	{
		this.flightService.createNewFlight(flight);
		return ResponseEntity.ok().build();
	}
	

//	update Flight
	
	@PutMapping("/change/flight")
	public ResponseEntity<?> updateFlight(@RequestBody Flight flight)
	{
		this.flightService.updateFlight(flight);
		return ResponseEntity.ok().build();
	}

	
//	get Flight by id
	
	@GetMapping("/get/flight/{id}")
	public ResponseEntity<?> getFlight(@PathVariable String id)
	{
		Flight flight = this.flightService.getSingleFlight(id);
		return ResponseEntity.ok(flight);
	}

//	get All Flight
	
	@GetMapping("/get/flights")
	public ResponseEntity<?> getAllFlight()
	{
		List<Flight> flights = this.flightService.getAllFlight();
		return ResponseEntity.ok(flights);
	}

		
//	delete Flight
	
	@DeleteMapping("/delete/flight/{id}")
	public ResponseEntity<?> deleteFlight(@PathVariable String id)
	{
		this.flightService.delteFlight(id);;
		return ResponseEntity.ok().build();
	}

}
