package com.example.demoModel;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DemoModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String password;
    private String role;
          
	public DemoModel() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public DemoModel(Long userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}

	
	
    

}
