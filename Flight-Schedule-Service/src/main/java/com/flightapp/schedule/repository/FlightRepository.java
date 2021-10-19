package com.flightapp.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flightapp.schedule.model.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight, String>
{

	Flight findByFlightNumber(String id);
	
}
