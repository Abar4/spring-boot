package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
