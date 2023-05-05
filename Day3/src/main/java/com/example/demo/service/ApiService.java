package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.repository.Repository;
import com.example.demo.model.Model;

@Service
public class ApiService {
    
	@Autowired
	Repository rep;
	public List<Model> bookDetails()
	{
		return rep.findAll();
	}
	
	public Optional<Model> getbybookId(@PathVariable int bookId)
	{
		return rep.findById(bookId);
	}
	
	public Model saveAll(Model m)
	{
		return rep.save(m);
	}
}
