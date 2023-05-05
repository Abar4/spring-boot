package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.ApiService;

@RestController
public class Controller {

	@Autowired
	ApiService ser;
	@GetMapping("/book")
	public List<Model> bookDetails()
	{
		return ser.bookDetails();
	}
	
	@GetMapping("/book/{bookId}")
	public Optional<Model> getbybookId(@PathVariable int bookId)
	{
		return ser.getbybookId(bookId);
	}
	
	@PostMapping("/books")
	public Model saveAll(@RequestBody Model m)
	{
		return ser.saveAll(m);
	}
	
}
