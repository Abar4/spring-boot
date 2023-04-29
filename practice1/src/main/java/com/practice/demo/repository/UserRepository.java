package com.practice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	User findByUsername(String username);

}
