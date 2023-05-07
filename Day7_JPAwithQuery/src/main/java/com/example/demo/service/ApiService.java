package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class ApiService {

	
	@Autowired
	EmployeeRepo rep;
	
	public List<Employee> getbyid(int id)
	{
		return rep.getById(id);
	}
	
	public List<Employee> getbydep(String department)
	{
		return rep.getByDepartment(department);
	}
	

	public List<Employee> getbysalhigh(int salary)
	{
		return rep.findBySalaryGreaterThan(salary);
	}

	public List<Employee> getbysallow(int salary)
	{
		return rep.findBySalaryLessThan(salary);
	}
	public Employee saveAll(Employee emp)
	{
		return rep.postDetails(emp);
	}
}
