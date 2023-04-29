package com.academy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academy.demo.model.UserModel;
import com.academy.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository ur;
	public String loginCheckData(String username,String password)
	{

		UserModel user = ur.findByusername(username);
		if(user == null)
		{
			return "Invalid User";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
		
	}

}
