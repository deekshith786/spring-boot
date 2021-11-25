package com.example.demo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demoModel.DemoModel;
import com.example.demoRespository.DemoRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	private DemoRepository demoRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		DemoModel demoModel = demoRepository.findByuserName(username);
		if(demoModel == null ) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomUserDetails(demoModel);
	}

}
