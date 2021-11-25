package com.example.demo.CollegeService;

import com.example.demo.CollegeModel.CollegeModel;
import com.example.demo.CollegeRepository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public CollegeModel addUserModel(CollegeModel user) {
        return collegeRepository.save(user);
    }

    public List<CollegeModel> fetchUsersList() {
        return collegeRepository.findAll();
    }

	public CollegeModel fetchUserById(Long userId) {
		return collegeRepository.findById(userId).get();
	}

	public void deleteUserById(Long userId) {
		collegeRepository.deleteById(userId);		
	}

	public CollegeModel fetchUserByName(String userName) {
		return collegeRepository.findByuserName(userName);
	}
	
    public void deleteUserWithName(String userName) {
    	collegeRepository.deleteByuserName(userName);
    }

    public void deleteAllUsers() {
    	collegeRepository.deleteAll();
    }

}
