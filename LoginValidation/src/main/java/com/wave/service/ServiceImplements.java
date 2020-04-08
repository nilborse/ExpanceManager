package com.wave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wave.dao.DaoRespositry;
import com.wave.model.Login;

@Service
public class ServiceImplements implements ServiceInterface {

	@Autowired
	private DaoRespositry d;
	@Override
	public Login getData(String uname, String pass) {
		Login l2 = d.findByUnameAndPass(uname, pass);
		return l2;
	}

	@Override
	public void push(Login l) {
		d.save(l);
		
	}

}
