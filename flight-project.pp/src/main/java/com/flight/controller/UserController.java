package com.flight.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.User;
import com.flight.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {
	 private UserService userService;
		public UserController(UserService userService) {
			super();
			this.userService = userService;
		}
		
		//Posting the value into database:
		@PostMapping()
		public ResponseEntity<User> createUser(@RequestBody User newUser){
			return new ResponseEntity<User>(userService.createUser(newUser), HttpStatus.CREATED);
			
		}
		
		//Updating the value into database:
		@PutMapping("{UserId}")
		public ResponseEntity<User> updateUser(@PathVariable("UserId") long uId, @RequestBody User newUser){
			return new ResponseEntity <User>
			(userService.updateUser(newUser, uId), HttpStatus.OK);
		}
		
		//Getting values by ID:
		@GetMapping("{UserId}")
		public ResponseEntity<User> findUserById(@PathVariable ("UserId")long uId){
			return new ResponseEntity<User>
			(userService.findUserById(uId), HttpStatus.OK);
		}
		
		//Get all:
		@GetMapping
		public List<User> displayAllUser(){
			return userService.displayAllUser();
		}
		
		//Delete:
		@DeleteMapping("{UserId}")
		public ResponseEntity<String> deleteUser(@PathVariable("UserId") long uId){
			userService.deleteUser(uId);
			return new ResponseEntity<String>
			("Flight data delete successfully",HttpStatus.OK);
		}
	

}
