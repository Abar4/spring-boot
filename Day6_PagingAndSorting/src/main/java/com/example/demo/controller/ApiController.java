package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.ApiService;


@RestController
public class ApiController {

	@Autowired
	ApiService ser;
	@PostMapping("/")
	public Boolean saveAll(@RequestBody Child m)
	{
		return ser.saveAll(m);
	}
	
	   @GetMapping("/{name}")
	   public List<Child>sorting(@PathVariable String name) 
	   { 
		   return ser.sorting(name); 
	   }
	
	   @GetMapping("/{offset}/{pageSize}")
	   public List<Child> paginging(@PathVariable int offset,@PathVariable int pageSize)
	   {
		   return ser.paginging(offset,pageSize); 
	   }
	   @GetMapping(value="/{offset}/{pageSize}/{field}")
	   public List<Child> PagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	   {
		   return ser.PagingAndSorting(offset, pageSize, field);
	   }
}
