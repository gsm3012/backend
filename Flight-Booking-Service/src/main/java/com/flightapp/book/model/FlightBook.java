package com.flightapp.book.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FlightBook 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightBookId;
	private Date bookingDate;
	private long pnrNumber;
	private String flightUniqueNumber;
	private String flightAirline;
	private Date flightDate;
	private String fromPlace;
	private String toPlace;
	private String classs;
	private int totalSeat;
	private int totalCost;
	
	@OneToOne
	private User user;

	public FlightBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightBook(int flightBookId, Date bookingDate, long pnrNumber, String flightUniqueNumber,
			String flightAirline, Date flightDate, String fromPlace, String toPlace, String classs, int totalSeat,
			int totalCost, User user) {
		super();
		this.flightBookId = flightBookId;
		this.bookingDate = bookingDate;
		this.pnrNumber = pnrNumber;
		this.flightUniqueNumber = flightUniqueNumber;
		this.flightAirline = flightAirline;
		this.flightDate = flightDate;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.classs = classs;
		this.totalSeat = totalSeat;
		this.totalCost = totalCost;
		this.user = user;
	}

	public int getFlightBookId() {
		return flightBookId;
	}

	public void setFlightBookId(int flightBookId) {
		this.flightBookId = flightBookId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public long getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getFlightUniqueNumber() {
		return flightUniqueNumber;
	}

	public void setFlightUniqueNumber(String flightUniqueNumber) {
		this.flightUniqueNumber = flightUniqueNumber;
	}

	public String getFlightAirline() {
		return flightAirline;
	}

	public void setFlightAirline(String flightAirline) {
		this.flightAirline = flightAirline;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
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

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "FlightBook [flightBookId=" + flightBookId + ", bookingDate=" + bookingDate + ", pnrNumber=" + pnrNumber
				+ ", flightUniqueNumber=" + flightUniqueNumber + ", flightAirline=" + flightAirline + ", flightDate="
				+ flightDate + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", classs=" + classs
				+ ", totalSeat=" + totalSeat + ", totalCost=" + totalCost + ", user=" + user + "]";
	}
}
