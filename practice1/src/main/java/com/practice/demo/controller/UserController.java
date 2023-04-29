package com.practice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.model.User;
import com.practice.demo.service.UserService;

@RestController
	public class UserController {
	@Autowired
	UserService usrService;
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody User u)
		{
		System.out.println(u.getUsername());
			return usrService.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public User saveUser(@RequestBody User u)
	{
	        return usrService.saveUser(u);
	}
	
	
	
	}



