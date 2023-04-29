package com.student.demo.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.student.demo.model.Database;
import com.student.demo.service.StudentService;

@RestController
public class StudentController {
  
	@Autowired
	public StudentService cserv;
	@PostMapping("/data")
    public Database savedetails(@RequestBody Database obj)
    {
	  return cserv.savedetails(obj);	
    }
	@DeleteMapping("/data/{id}")
	public String deletedDetails(@PathVariable ("id") int id)
	{
		return "Deletion was successfull!";
	}
	@GetMapping("/data/{id}")
	public Optional<Database> getdetails(@PathVariable ("id") int id)
	{
		return cserv.getdetails(id);
	}
	@PutMapping("/updatedata")
	public Database updateDetails(@RequestBody Database id)
	{
		return cserv.updateInfo(id);	
	}
}
