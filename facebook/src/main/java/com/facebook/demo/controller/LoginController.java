package com.facebook.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class LoginController {
	
      @ResponseBody
      @RequestMapping(value="/login",method=RequestMethod.GET)
      public String Login()
      {
    	  return "I'm in Login Page";
      }
      @ResponseBody
      @RequestMapping(value="/signup",method=RequestMethod.GET)
      public String SignUp()
      {
    	  return "I'm in Signup Page";
      }
}
