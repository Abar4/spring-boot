package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/students/{studentId}/courses")
	public String display(@PathVariable int studentId)
	{
	   return "registration successfull for "+studentId;
	}
	
	@GetMapping("/students/{studentId}/courses/{courseId}")
	public String display(@PathVariable int studentId,@PathVariable int courseId)
	{
	   return studentId+" registration successfull for CourseId "+courseId;
	}
	
}
