package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;
@RestController
public class Apicontroller {

	@Autowired
	ApiService ser;
	@GetMapping("/employee/{id}")
	public List<Employee> getbyid(@PathVariable int id)
	{
		return ser.getbyid(id);
	}
	@GetMapping("/department/{department}")
	public List<Employee> getbydep(@PathVariable String department)
	{
		return ser.getbydep(department);
	}
	
	@GetMapping("/salary/{salary}/high")
	public List<Employee> getbysalhigh(@PathVariable int salary)
	{
		return ser.getbysalhigh(salary);
	}
	
	@GetMapping("/salary/{salary}/low")
	public List<Employee> getbysallow(@PathVariable int salary)
	{
		return ser.getbysallow(salary);
	}
	@PostMapping("/")
	public Employee saveAll(@RequestBody Employee emp)
	{
		return ser.saveAll(emp);
	}
	
}
