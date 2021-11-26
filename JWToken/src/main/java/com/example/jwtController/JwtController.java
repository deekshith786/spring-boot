package com.example.jwtController;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.jwt.JwtModel;
import com.example.jwtService.JwtService;

public class JwtController {

	@Autowired
	private JwtService jwtService;
	
    @GetMapping("/user")
    @RolesAllowed("user")
    public String usesrPage(){ return "From the userPage"; }

    @GetMapping("/admin")
    @RolesAllowed("admin")
    public String adminPage(){ return "From the adminPage"; }

    @GetMapping("/all")
    @RolesAllowed("user")
    public List<JwtModel> getallUsers() {
        return jwtService.fetchallUsers();
    }
    
    @PostMapping("/add")
    @RolesAllowed("admin")
    public JwtModel createUsers(@RequestBody JwtModel user) {
        return jwtService.addNewUser(user);
    }

}
