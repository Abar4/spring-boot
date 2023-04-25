package com.whatsapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.demo.model.Student;
import com.whatsapp.demo.service.StudentService;

@RestController
public class StudentController {
   @Autowired
   StudentService stud;
   @GetMapping(value="fetchStudents")
   public List<Student> getAllStudents()
   {
	   List<Student>studList=stud.getAllStudents();
	   return studList;
   }
   @PostMapping(value="/saveStudent")
   public Student saveStudent(@RequestBody Student s)
   {
	   return stud.saveStudent(s);
   }

}
