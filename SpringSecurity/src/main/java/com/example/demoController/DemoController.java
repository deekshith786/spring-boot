package com.example.demoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demoModel.DemoModel;
import com.example.demoService.DemoService;

public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@GetMapping("/user")
	public String userPage() {
		return "from user page";
	}

	@GetMapping("/admin")
	public String adminPage() {
		return "from admin page";
	}
	
	@PostMapping("/add")
	public DemoModel createUsers(@RequestBody DemoModel user) {
	    return demoService.addNewUser(user);
	}
	
	@GetMapping("/get")
	public List<DemoModel> getall(){
		return demoService.getall();
	}

	

}
