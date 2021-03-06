package com.flightapp.search.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class FlightSchedule 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightScheduleId;
	private String flightDate;
	@Transient
	private String returnDate;
	private String toPlace;
	private String fromPlace;
	private int businessClassSeat;
	private int nonBussinessClassSeat;
	private boolean isActive=true;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Flight flight;
	
	public FlightSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightSchedule(int flightScheduleId, String flightDate, String returnDate, String toPlace, String fromPlace,
			int businessClassSeat, int nonBussinessClassSeat, boolean isActive, Flight flight) {
		super();
		this.flightScheduleId = flightScheduleId;
		this.flightDate = flightDate;
		this.returnDate = returnDate;
		this.toPlace = toPlace;
		this.fromPlace = fromPlace;
		this.businessClassSeat = businessClassSeat;
		this.nonBussinessClassSeat = nonBussinessClassSeat;
		this.isActive = isActive;
		this.flight = flight;
	}

	public int getFlightScheduleId() {
		return flightScheduleId;
	}

	public void setFlightScheduleId(int flightScheduleId) {
		this.flightScheduleId = flightScheduleId;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	
	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public int getBusinessClassSeat() {
		return businessClassSeat;
	}

	public void setBusinessClassSeat(int businessClassSeat) {
		this.businessClassSeat = businessClassSeat;
	}

	public int getNonBussinessClassSeat() {
		return nonBussinessClassSeat;
	}

	public void setNonBussinessClassSeat(int nonBussinessClassSeat) {
		this.nonBussinessClassSeat = nonBussinessClassSeat;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "FlightSchedule [flightScheduleId=" + flightScheduleId + ", flightDate=" + flightDate + ", toPlace="
				+ toPlace + ", fromPlace=" + fromPlace + ", businessClassSeat=" + businessClassSeat
				+ ", nonBussinessClassSeat=" + nonBussinessClassSeat + ", isActive=" + isActive + ", flight=" + flight
				+ "]";
	}
}