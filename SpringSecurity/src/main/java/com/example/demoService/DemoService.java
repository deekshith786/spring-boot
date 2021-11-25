package com.example.demoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoModel.DemoModel;
import com.example.demoRespository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;
	
	public DemoModel addNewUser(DemoModel user) {
		// TODO Auto-generated method stub
		return demoRepository.save(user);
	}

	public List<DemoModel> getall() {
		return demoRepository.findAll();
	}

}
