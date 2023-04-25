package com.instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginDemoController {
    @GetMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("abi")&&password.equals("064"))
		{
			return "Login Successful for "+username;
		}
		else 
		{
			return "Login failed! Please,check your password and username";
		}
	}
}
