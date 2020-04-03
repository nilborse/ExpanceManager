package com.wave.controller;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	
	@Autowired
	private UserRespositry us;
	
	public User get(String useremail,String pass)
	{
		
		
		return  (User) us.findAll();
		
	}
	
	
}
