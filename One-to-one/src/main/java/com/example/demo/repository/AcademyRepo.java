package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Academy;

public interface AcademyRepo extends JpaRepository<Academy,Integer> {
	

}
