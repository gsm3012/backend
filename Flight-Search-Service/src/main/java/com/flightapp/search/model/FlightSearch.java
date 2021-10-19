package com.flightapp.search.model;

public class FlightSearch 
{
	private String to;
	private String from;
	private String departDate;
	private String returnDate;
	
	public FlightSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightSearch(String to, String from, String departDate, String returnDate) {
		super();
		this.to = to;
		this.from = from;
		this.departDate = departDate;
		this.returnDate = returnDate;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getDepartDate() {
		return departDate;
	}

	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "FlightSearch [to=" + to + ", from=" + from + ", departDate=" + departDate + ", returnDate=" + returnDate
				+ "]";
	}
}

