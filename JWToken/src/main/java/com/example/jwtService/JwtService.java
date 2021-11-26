package com.example.jwtService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jwt.JwtModel;
import com.example.jwtRepository.JwtRepository;

@Service
public class JwtService {

	@Autowired
	private JwtRepository jwtRepository;
	
	public List<JwtModel> fetchallUsers() {
		// TODO Auto-generated method stub
		return jwtRepository.findAll();
	}

	public JwtModel addNewUser(JwtModel user) {
		// TODO Auto-generated method stub
		return jwtRepository.save(user);
	}
	
	

}
