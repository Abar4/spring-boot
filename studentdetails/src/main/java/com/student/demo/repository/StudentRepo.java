package com.student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Database;

public interface StudentRepo extends JpaRepository<Database, Integer>
{

}
