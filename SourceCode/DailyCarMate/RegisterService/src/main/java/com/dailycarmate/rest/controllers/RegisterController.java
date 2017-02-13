package com.dailycarmate.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycarmate.model.User;
import com.dailycarmate.service.UserService;

@RestController
@RequestMapping("user")
public class RegisterController {

	@Autowired
	private UserService userService;
	
	@PostMapping("register")
	public boolean register(@RequestBody User user)
	{
		return userService.save(user);
	}
	
	
}
