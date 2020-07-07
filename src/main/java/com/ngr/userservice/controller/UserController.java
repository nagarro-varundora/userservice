package com.ngr.userservice.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ngr.userservice.model.dto.UserDetails;
import com.ngr.userservice.service.impl.UserService;

@ControllerAdvice
@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDetails> getUserDetails(@PathVariable("id") int userId){
		return ResponseEntity.ok(userService.getUserById(userId));
	}

	@ExceptionHandler({NoSuchElementException.class})
	private ResponseEntity<?> noSuchElementExceptionHandler(NoSuchElementException ex){
		return ResponseEntity.notFound().build();
	}
}
