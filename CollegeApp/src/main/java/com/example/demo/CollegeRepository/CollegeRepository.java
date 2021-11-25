package com.example.demo.CollegeRepository;

import com.example.demo.CollegeModel.CollegeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeModel, Long> {

	CollegeModel findByuserName(String userName);

	void deleteByuserName(String userName);
}
