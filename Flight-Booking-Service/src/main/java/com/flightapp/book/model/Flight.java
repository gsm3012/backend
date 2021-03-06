package com.flightapp.book.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	@Column(unique = true)
	private String flightNumber;
	@Column(unique = true)
	private String flightAirline;
	private String scheduleDays;
	private int ticketCost;
	private String meal;
	private String fromPlace;
	private String toPlace;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightId, String flightNumber, String flightAirline, String scheduleDays, int ticketCost, String meal, String fromPlace, String toPlace) {
		super();
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.flightAirline = flightAirline;
		this.scheduleDays = scheduleDays;
		this.ticketCost = ticketCost;
		this.meal = meal;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
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

	public String getScheduleDays() {
		return scheduleDays;
	}

	public void setScheduleDays(String scheduleDays) {
		this.scheduleDays = scheduleDays;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightNumber=" + flightNumber + ", flightAirline=" + flightAirline
				+ ", scheduleDays=" + scheduleDays + ", ticketCost=" + ticketCost + ", meal=" + meal
				+ ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + "]";
	}
	
}