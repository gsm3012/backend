package com.flightapp.security.configuration;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.flightapp.security.model.Authority;
import com.flightapp.security.model.User;

public class CustomUserDetails implements UserDetails
{
	
	private User user;
	
	public CustomUserDetails(User user) {
		super();
		this.user = user;
	}

	public CustomUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		HashSet<Authority> set = new HashSet<>();
		set.add(new Authority(this.user.getRole().getRole()));
		
		return set;
	}

	@Override
	public String getPassword() {
		return this.user.getUserPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getUserEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
