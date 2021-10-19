package com.flightapp.service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.dao.RoleRepository;
import com.flightapp.dao.UserRepository;
import com.flightapp.model.Role;
import com.flightapp.model.User;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	
//	Creating User
	
	public void createUser(User user)
	{
		Role role = new Role();
		role.setRoleId(2);
		role.setRole("user");
		
		this.roleRepo.save(role);
		
		user.setRegistrationDate(new Date());
		user.setRole(role);
		
		this.userRepo.save(user);	
	}
	

//	getting user by user Id	
	
	public User getUser(int id)
	{
		return this.userRepo.findById(id).orElseThrow(()-> new NoSuchElementException("User not present with given Id"));
	}
	
	
//	update User
	
	public void updateUser(User user)
	{
		List<User> oldUser = new ArrayList<>();
		
		this.userRepo.findAll().forEach(e->oldUser.add(e));
		
		List<User> users = oldUser.stream().map(e->{
			
			if(e.getUserId()==user.getUserId())
			{
				e.setUserEmail(user.getUserEmail());
				e.setUserMobile(user.getUserMobile());
				e.setUserName(user.getUserName());
				e.setUserPassword(user.getUserPassword());
			}
			
			return e;
		}).collect(Collectors.toList());
		
		this.userRepo.saveAll(users);
	}
	
	
//	Delete User
	
	public void deleteUser(int id)
	{
		this.userRepo.deleteById(id);
	}
	
}
