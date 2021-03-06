package com.flightapp.search.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.search.model.FlightSchedule;

@Repository
public interface FlightSearchRepository extends JpaRepository<FlightSchedule, Integer>
{
	
	public List<FlightSchedule> findAllByToPlaceAndFromPlaceAndFlightDate(String to, String from, String date);

	public List<FlightSchedule> findAllByToPlace(String toPlace);
	
}
