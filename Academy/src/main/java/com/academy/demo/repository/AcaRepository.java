package com.academy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.demo.model.AcademyModel;


@Repository
public interface AcaRepository extends JpaRepository<AcademyModel,Integer>{
	
}
