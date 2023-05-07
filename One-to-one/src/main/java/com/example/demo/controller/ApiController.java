package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.model.Academy;
import com.example.demo.service.ApiService;

public class ApiController {

	@Autowired
	 ApiService ser;
	 
	  @PostMapping("/saveAllDetails")
	   public  Academy saveAllDetails(@RequestBody Academy obj)
	   {
	  	 return ser.saveAllDetails(obj);
	   }

	  @GetMapping("/fetchAllDetails")
	   public List<Academy> fetchAllDetails()
	   {
		  return  ser.fetchAllDetails();
	   }  
	  
}
