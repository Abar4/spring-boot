package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;
@Service
public class ApiService {
	
	@Autowired
	Repository rep;
	public String deletebyid(int bookId)
	{
		 rep.deleteById(bookId);
		return "deleted successfully!";
	}
	public Model updateDetails(Model tt)
	{
		Model obj1=rep.saveAndFlush(tt);
		return obj1;
	}

}
