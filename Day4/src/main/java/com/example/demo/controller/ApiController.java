package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService ser;
	
	@PutMapping("/books")
    public Model updateDetails(@RequestBody Model obj)
    {
    	return ser.updateDetails(obj);
    }
	
	@DeleteMapping("/book/{bookId}")
	public String deletebyid(@PathVariable int bookId)
	{
		return ser.deletebyid(bookId);
		
	}
	

}
