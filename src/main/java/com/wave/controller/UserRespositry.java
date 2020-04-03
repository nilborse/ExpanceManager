package com.wave.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespositry extends JpaRepository<User, Integer> {
	
	

}
