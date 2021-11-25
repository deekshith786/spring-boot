package com.example.demo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.example.demoModel.DemoModel;


public class CustomUserDetails implements UserDetails{

	
	private DemoModel  demoModel;	
	
	public CustomUserDetails(DemoModel demoModel) {
		super();
		this.demoModel = demoModel;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority(demoModel.getRole()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return demoModel.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return demoModel.getRole();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
