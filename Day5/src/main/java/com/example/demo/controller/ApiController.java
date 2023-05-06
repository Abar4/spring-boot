package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.ModelClass;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService ser;
	@GetMapping("/")
	public List<ModelClass> getDetails()
	{
		return ser.getDetails();
	}
	
	@GetMapping("/{id}")
	public Optional<ModelClass> getbyId(@PathVariable int id)
	{
		return ser.getbyId(id);
	}
	
	@PostMapping("/")
	public Boolean saveAll(@RequestBody ModelClass m)
	{
		return ser.saveAll(m);
	}
	@PutMapping("/{id}")
    public ModelClass updateDetails(@PathVariable int id)
    {
    	return ser.updateDetails(id);
    }
	
	@DeleteMapping("/{id}")
	public Boolean deletebyid(@PathVariable int id)
	{
		return ser.deletebyid(id);
	}
	
}
