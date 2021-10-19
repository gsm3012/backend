package com.flightapp.schedule.model;

public class TempFlight 
{
	private String flightDate;
	private String toPlace;
	private String fromPlace;
	private int businessClassSeat;
	private int nonBussinessClassSeat;
	private String flight;
	
	public TempFlight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TempFlight(String flightDate, String toPlace, String fromPlace, int businessClassSeat,
			int nonBussinessClassSeat, String flight) {
		super();
		this.flightDate = flightDate;
		this.toPlace = toPlace;
		this.fromPlace = fromPlace;
		this.businessClassSeat = businessClassSeat;
		this.nonBussinessClassSeat = nonBussinessClassSeat;
		this.flight = flight;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
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

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "TempFlight [flightDate=" + flightDate + ", toPlace=" + toPlace + ", fromPlace=" + fromPlace
				+ ", businessClassSeat=" + businessClassSeat + ", nonBussinessClassSeat=" + nonBussinessClassSeat
				+ ", flight=" + flight + "]";
	}
}
