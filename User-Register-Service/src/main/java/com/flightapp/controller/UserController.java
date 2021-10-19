package com.flightapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.model.User;
import com.flightapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	

//	Creating User
	
	@PostMapping("/registration")
	public ResponseEntity<?> saveUser(@Valid @RequestBody User user)
	{
		this.userService.createUser(user);
		return ResponseEntity.ok().build();
	}

	
//	Fetching User
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> fetchUser(@PathVariable int id)
	{
		User user = this.userService.getUser(id);
		return ResponseEntity.ok(user);
	}
	

//	Updating User
	
	@PutMapping("/update")
	public ResponseEntity<?> updateUser(@Valid @RequestBody User user)
	{		
		this.userService.updateUser(user);
		return ResponseEntity.ok().build(); 
	}
	

//	Delete User
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable int id)
	{
		this.userService.deleteUser(id);
		return ResponseEntity.ok().build();
	}
	
}
