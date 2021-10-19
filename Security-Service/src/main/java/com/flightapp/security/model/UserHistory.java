package com.flightapp.security.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserHistory 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userHistoryId;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private History history;

	public UserHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserHistory(int userHistoryId, User user, History history) {
		super();
		this.userHistoryId = userHistoryId;
		this.user = user;
		this.history = history;
	}

	public int getUserHistoryId() {
		return userHistoryId;
	}

	public void setUserHistoryId(int userHistoryId) {
		this.userHistoryId = userHistoryId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public History getHistory() {
		return history;
	}

	public void setHistory(History history) {
		this.history = history;
	}	
}
