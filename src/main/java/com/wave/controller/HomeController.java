package com.wave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	private Service ser;
	
	@RequestMapping("/")
	public String loginFirst()
	{
		System.out.println("in login method");
		return "index.html";
	}
	
//	@RequestMapping("/loginform")
//	public String registerFirst(@RequestParam String useremail, @RequestParam String pass)
//	{
//		System.out.println("in login get method");
//		
//		ser.get(useremail, pass);
//		return "dashboard.html";
//	}

	
	
	 @RequestMapping("/reg")
	  public String openRegister() 
	  {
		  System.out.println("In Login Page"); 
		  return "register.html";
	  
	  }
	 
	 @RequestMapping("/das")
		public String dashFirst()
		{
			System.out.println("in login method");
			return "dashboard.html";
		}
	 
}
