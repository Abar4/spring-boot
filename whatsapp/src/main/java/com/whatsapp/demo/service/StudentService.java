package com.whatsapp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsapp.demo.model.Student;
import com.whatsapp.demo.repository.StudentRepository;

@Service
public class StudentService {
 @Autowired
 StudentRepository rep;
 public List<Student> getAllStudents()
 {
	 List<Student>studList=rep.findAll();
	 return studList;
 }
 public Student saveStudent(Student s)
 {
	 Student obj=rep.save(s);
	 return obj;
 }
}
