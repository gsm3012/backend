package com.flightapp.schedule.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.schedule.model.Flight;
import com.flightapp.schedule.model.FlightSchedule;
import com.flightapp.schedule.model.TempFlight;
import com.flightapp.schedule.repository.FlightRepository;
import com.flightapp.schedule.repository.FlightScheduleRepository;

@Service
public class FlightScheduleService 
{
	@Autowired
	private FlightScheduleRepository schedule;
	
	@Autowired
	private FlightRepository fl;
	
	
//	create schedule
	
	public void createSchedule(TempFlight tempFlight)
	{
		Flight f = new Flight();
		f.setFlightNumber(tempFlight.getFlight());
		
		FlightSchedule flight = new FlightSchedule();
		flight.setFlight(f);
		flight.setToPlace(tempFlight.getToPlace());
		flight.setFromPlace(tempFlight.getFromPlace());
		flight.setBusinessClassSeat(tempFlight.getBusinessClassSeat());
		flight.setNonBussinessClassSeat(tempFlight.getNonBussinessClassSeat());
		flight.setFlightDate(tempFlight.getFlightDate());
		
		this.schedule.save(flight);
	}

	
//	get  schedule
	
	public List<FlightSchedule> getAllSchedule()
	{
		return this.schedule.findAll();
	}
	
	
//	gets single schedule
	
	public FlightSchedule getSingleSchedule(int id)
	{
		return this.schedule.findById(id).get();
	}
	
	
//	delete schedule
	
	public void deleteSchedule(int id)
	{
		this.schedule.deleteById(id);
	}

	
//	update schedule
	
	public void updateSchedule(FlightSchedule flightSchedule)
	{
		List<FlightSchedule> flights = this.schedule.findAll();
		
		List<FlightSchedule> newFlights = flights.stream().map(e->{
			if(e.getFlightScheduleId()==flightSchedule.getFlightScheduleId())
			{
				e.setFlightDate(flightSchedule.getFlightDate());
				e.setBusinessClassSeat(flightSchedule.getBusinessClassSeat());
				e.setNonBussinessClassSeat(flightSchedule.getNonBussinessClassSeat());
				e.setIsActive(flightSchedule.getIsActive());
				e.setToPlace(flightSchedule.getToPlace());
				e.setFromPlace(flightSchedule.getFromPlace());
			}
			return e;
		}).collect(Collectors.toList());
		
		this.schedule.saveAll(newFlights);
	}
}


