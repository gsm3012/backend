package com.flightapp.schedule.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class History 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int historyId;
	private int flightNumber;
	private String flightAirline;
	private Time startTime;
	private Time endTime;
	private Date flightDate;
	private Date bookingDate;
	private String fromPlace;
	private String toPlace;
	private int seatNumber;
	private int ticketCost;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "history")
	private List<UserHistory> history = new ArrayList<>();

	public History() {
		super();
		// TODO Auto-generated constructor stub
	}

	public History(int historyId, int flightNumber, String flightAirline, Time startTime, Time endTime, Date flightDate,
			Date bookingDate, String fromPlace, String toPlace, int seatNumber, int ticketCost,
			List<UserHistory> history) {
		super();
		this.historyId = historyId;
		this.flightNumber = flightNumber;
		this.flightAirline = flightAirline;
		this.startTime = startTime;
		this.endTime = endTime;
		this.flightDate = flightDate;
		this.bookingDate = bookingDate;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.seatNumber = seatNumber;
		this.ticketCost = ticketCost;
		this.history = history;
	}

	public int getHistoryId() {
		return historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightAirline() {
		return flightAirline;
	}

	public void setFlightAirline(String flightAirline) {
		this.flightAirline = flightAirline;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
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

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public List<UserHistory> getHistory() {
		return history;
	}

	public void setHistory(List<UserHistory> history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "History [historyId=" + historyId + ", flightNumber=" + flightNumber + ", flightAirline=" + flightAirline
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", flightDate=" + flightDate + ", bookingDate="
				+ bookingDate + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", seatNumber=" + seatNumber
				+ ", ticketCost=" + ticketCost + ", history=" + history + "]";
	}
}
