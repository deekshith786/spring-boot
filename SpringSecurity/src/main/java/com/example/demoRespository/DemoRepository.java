package com.example.demoRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoModel.DemoModel;

@Repository
public interface DemoRepository extends JpaRepository<DemoModel, Long>{
	
	DemoModel findByuserName(String userName);

}
