package com.student.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.demo.model.Database;
import com.student.demo.repository.StudentRepo;

@Service
public class StudentService 
{
    @Autowired
    public StudentRepo repo;
    public Database savedetails(Database obj)
    {
    	return repo.save(obj);
    }
    public void deletedDetails(int id)
    {
    	repo.deleteById(id);
    }
    public Optional<Database> getdetails(int id)
    {
    	return repo.findById(id);
    }
    public Database updateInfo(Database id)
    {
    	return repo.saveAndFlush(id);
    }
}
