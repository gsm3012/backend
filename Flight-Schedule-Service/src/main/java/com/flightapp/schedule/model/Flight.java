package com.flightapp.schedule.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight 
{
	@Id
	private String flightNumber;
	private String flightAirline;
	private String scheduleDays;
	private String flightTime;
	private int ticketCost;
	private String meal;

	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(String flightNumber, String flightAirline, String scheduleDays, String flightTime, int ticketCost, String meal) {
		super();
		this.flightNumber = flightNumber;
		this.flightAirline = flightAirline;
		this.scheduleDays = scheduleDays;
		this.flightTime = flightTime;
		this.ticketCost = ticketCost;
		this.meal = meal;
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
	
	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
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

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightAirline=" + flightAirline
				+ ", scheduleDays=" + scheduleDays + ", flightTime=" + flightTime + ", ticketCost=" + ticketCost
				+ ", meal=" + meal + "]";
	}
}