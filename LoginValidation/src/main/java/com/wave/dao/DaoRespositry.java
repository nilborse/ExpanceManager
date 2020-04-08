package com.wave.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wave.model.Login;
@Repository
public interface DaoRespositry extends JpaRepository<Login, Integer> {
	
	
	public Login findByUnameAndPass(String uname,String pass);

}
