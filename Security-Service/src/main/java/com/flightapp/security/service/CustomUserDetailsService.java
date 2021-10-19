package com.flightapp.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.flightapp.security.configuration.CustomUserDetails;
import com.flightapp.security.dao.SecurityRepository;
import com.flightapp.security.model.User;

public class CustomUserDetailsService implements UserDetailsService
{

	@Autowired
	private SecurityRepository secureRepo;
	
	@Override
	public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
		
		User user = this.secureRepo.findByUserEmail(userEmail);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User is not present");
		}
		
		return new CustomUserDetails(user);
	}
	
}
