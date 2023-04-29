package com.academy.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.academy.demo.model.AcademyModel;
import com.academy.demo.service.AcaService;



@RestController
public class AcaController {

	
	@Autowired
    AcaService ser;
	@PostMapping("/reg")
	public AcademyModel savedet(@RequestBody AcademyModel obj) 
	{
		return ser.savedet(obj);
	}
    @GetMapping("/getall")
    public List<AcademyModel> getAllDetails()
    {
    	return ser.getAllDetails();
    }
    @GetMapping("/sortStudents/{name}")
    public List<AcademyModel>sortStudents(@PathVariable String name) 
    { 
 	   return ser.sortStudents(name); 
    }
    @GetMapping("/pagingStudents/{offset}/{pageSize}")
    public List<AcademyModel> pagingStudents(@PathVariable int offset,@PathVariable int pageSize)
    {
 	   return ser.pagingStudents(offset,pageSize); 
    }
    @GetMapping(value="/pagingAndSorting/{offset}/{pageSize}/{field}")
    public List<AcademyModel> PagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
    {
 	   return ser.PagingAndSorting(offset, pageSize, field);
    }
	}
    

