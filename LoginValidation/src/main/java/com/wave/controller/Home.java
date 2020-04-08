package com.wave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wave.model.Login;
import com.wave.service.ServiceInterface;

@RestController
@RequestMapping("/Log")
public class Home {


	@Autowired
	private ServiceInterface s;
	
	
	@GetMapping("/get/{uname}/{pass}")
	public Login inLogin(@PathVariable String uname, @PathVariable String pass)
	{
		System.out.println("In login method");
		Login l1 = s.getData(uname, pass);
		return l1;
	}
	
	@PostMapping("/reg")
	public void insrt(@RequestBody Login l)
	{
		s.push(l);
		System.out.println("In login method");
		
	}
}
