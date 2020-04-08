package com.wave.service;

import com.wave.model.Login;

public interface ServiceInterface {
	
	
	public void push(Login l);
	public Login getData(String uname, String pass);

}
