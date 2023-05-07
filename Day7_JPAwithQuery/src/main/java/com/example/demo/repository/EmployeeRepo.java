package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	@Query("select s from Employee s where s.id=:id")
	public List<Employee> getById(int id);
	
	@Query("select s from Employee s where s.department=:department")
	public List<Employee> getByDepartment(String department);
//	
//	@Query("select e from Employee e where e.salary > ")
//	public List<Employee> getBySalaryHigh(int salary);
//	
//	@Query("select e from Employee e where e.salary< sal where sal=?1")
//	public List<Employee> getBySalaryLow(int salary);
	
	List<Employee> findBySalaryGreaterThan(int salary);
	
	List<Employee> findBySalaryLessThan(int salary);
	
	@Query(value="insert into employee(id,employeeName,email,mobile,address,roll,salary,department) values(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
	public Employee postDetails(Employee emp);
}
