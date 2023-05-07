package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Academy;
import com.example.demo.repository.AcademyRepo;

@Service
public class ApiService {
    @Autowired
	AcademyRepo rep;
	  public List<Academy> fetchAllDetails()
	   {
		  return  rep.findAll();
	   }  

	   public  Academy saveAllDetails(@RequestBody Academy obj)
	   {
		 return rep.save(obj);
	   }
	   
}
