package com.academy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.demo.model.CourseModel;
@Repository
public interface CourseRepository extends JpaRepository<CourseModel,Integer>{
	

}
