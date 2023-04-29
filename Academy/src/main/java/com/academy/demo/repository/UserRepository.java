package com.academy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.demo.model.UserModel;

@Repository

public interface UserRepository extends JpaRepository <UserModel,Integer>{
	
    UserModel findByusername(String username);
}
