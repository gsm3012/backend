package com.flightapp.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.security.model.User;

public interface SecurityRepository extends JpaRepository<User, Integer>
{
	public User findByUserEmail(String email); 
}
