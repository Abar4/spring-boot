package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    public String yourFavColor;
    @Value("${yourFavColor}")
    @GetMapping("/")
	public String getMyFav()
	{
		return "My favorite color is "+yourFavColor;
	}
}
