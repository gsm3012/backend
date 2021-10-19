package com.flightapp.book.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightSchedule 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightScheduleId;
	@Column(nullable = false)
	private String flightDate;
	@Column(nullable = false)
	private String flightTime;
	@Column(nullable = false)
	private String toPlace;
	@Column(nullable = false)
	private String fromPlace;
	@Column(nullable = false)
	private String flightNumber;
	private String flightAirline;
	@Column(nullable = false)
	private int flightTicket=0;
	@Column(nullable = false)
	private int businessClassSeat;
	@Column(nullable = false)
	private int nonBussinessClassSeat;
	private String meal="veg";
	private boolean isActive=true;
	
	public FlightSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightSchedule(int flightScheduleId, String flightDate, String flightTime, String toPlace, String fromPlace,
			String flightNumber, String flightAirline, int flightTicket, int businessClassSeat,
			int nonBussinessClassSeat, String meal, boolean isActive) {
		super();
		this.flightScheduleId = flightScheduleId;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.toPlace = toPlace;
		this.fromPlace = fromPlace;
		this.flightNumber = flightNumber;
		this.flightAirline = flightAirline;
		this.flightTicket = flightTicket;
		this.businessClassSeat = businessClassSeat;
		this.nonBussinessClassSeat = nonBussinessClassSeat;
		this.meal = meal;
		this.isActive = isActive;
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

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
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

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightAirline() {
		return flightAirline;
	}

	public void setFlightAirline(String flightAirline) {
		this.flightAirline = flightAirline;
	}

	public int getFlightTicket() {
		return flightTicket;
	}

	public void setFlightTicket(int flightTicket) {
		this.flightTicket = flightTicket;
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

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "FlightSchedule [flightScheduleId=" + flightScheduleId + ", flightDate=" + flightDate + ", flightTime="
				+ flightTime + ", toPlace=" + toPlace + ", fromPlace=" + fromPlace + ", flightNumber=" + flightNumber
				+ ", flightAirline=" + flightAirline + ", flightTIcket=" + flightTicket + ", businessClassSeat="
				+ businessClassSeat + ", nonBussinessClassSeat=" + nonBussinessClassSeat + ", meal=" + meal
				+ ", isActive=" + isActive + "]";
	}
}
