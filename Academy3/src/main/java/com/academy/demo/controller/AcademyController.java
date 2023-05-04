package com.academy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.academy.demo.model.AcademyModel;
import com.academy.demo.service.AcademyService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
@RestController
public class AcademyController {

	
	@Autowired
	AcademyService ser;
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
	
	//one-to-one relation
	@Operation(summary = "Get all the students")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Records of all fetched successfully!!"),

			@ApiResponse(responseCode = "401", description = "Invalid credentials"),

			@ApiResponse(responseCode = "404", description = "Path not found") })
	
	 @GetMapping("/fetchAllDetails")
	   public List<AcademyModel> fetchAllDetails()
	   {
		  return  ser.fetchAllDetails();
	   }  
	 
	@Operation(summary = "Save all the students")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Records of all Saved successfully"),

			@ApiResponse(responseCode = "401", description = "Invalid credentials"),

			@ApiResponse(responseCode = "404", description = "Path not found") })

	  @PostMapping("/saveAllDetails")
	   public  AcademyModel saveAllDetails(@RequestBody AcademyModel obj)
	   {
	  	 return ser.saveAllDetails(obj);
	   }
	
     // derived Query
	@Operation(summary = "Get students by firstname")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Student data fetched successfully"),

			@ApiResponse(responseCode = "401", description = "Invalid credentials"),

			@ApiResponse(responseCode = "404", description = "Path not found") })

	  @GetMapping("/fetchbyfirstname/{firstname}")
	   public AcademyModel fetchByFirstname(@PathVariable String firstname)
	   {
		   return ser.fetchByFirstname(firstname);
	   }
	  
	 //DML QUERY
	@Operation(summary = "Delete students by lastname")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Student data deleted successfully"),

			@ApiResponse(responseCode = "401", description = "Invalid credentials"),

			@ApiResponse(responseCode = "404", description = "Path not found") })

	  @DeleteMapping("/deletebylastname/{lastname}")
	   public String deleteLastname(@PathVariable String lastname)
	   {
	   int result=ser.deleteLastname(lastname);
	   if(result >0)
	   	return "Record deleted!";
	   else
	   	return "Failed!!!";
	   }
	  
	@Operation(summary = "update students by firstname")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Student data updated successfully"),

			@ApiResponse(responseCode = "401", description = "Invalid credentials"),

			@ApiResponse(responseCode = "404", description = "Path not found") })

	  @PutMapping("/updatelastname/{lastname}/{firstname}")
	   public String updateLastname(@PathVariable String lastname,@PathVariable String firstname)
	   {
	   int result=ser.updateLastname(lastname,firstname);	
	   if(result >0)
	   	return "Record updated successfully!";
	   else
	   	return "Failed to update your record.Try Again!!!";
	   }
	  
	  //select query
	@Operation(summary = "Get students by admissionid")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Student data fetched successfully"),

			@ApiResponse(responseCode = "401", description = "Invalid credentials"),

			@ApiResponse(responseCode = "404", description = "Path not found") })

	  @GetMapping("/fetchbyadmissionid/{admissionid}")
	   public List<AcademyModel> fetchbyId(@PathVariable int admissionid)
	   {
		   return ser.fetchbyId(admissionid);
	   }
	  

}
