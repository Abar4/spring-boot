package com.academy.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class UserModel {
	@Id
	private String username;
	private String password;
	UserModel(){}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
