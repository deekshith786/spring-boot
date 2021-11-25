package com.example.demo.CollegeController;

import com.example.demo.CollegeModel.CollegeModel;
import com.example.demo.CollegeService.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/college")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

//    add a new user to the application
    @PostMapping("/addUser")
    public CollegeModel addUserModel(@RequestBody CollegeModel user) {
        return collegeService.addUserModel(user);
    }

//    fetch all the users from the Application
    @GetMapping("/getAllUsers")
    public List<CollegeModel> fetchUsersList(){
        return collegeService.fetchUsersList();
    }
    
//    delete a user by userId
    @GetMapping("/getUserById/{id}")
    public CollegeModel fetchUserById(@PathVariable("id") Long userId){
        return collegeService.fetchUserById(userId);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public String deleteUser(@PathVariable("id") Long userId){
    	collegeService.deleteUserById(userId);
        return "User Deleted successfully";
    }
    
//    get count of all users in the application
    @GetMapping("/count")
    public String getAllUsersCount(){
        return "The available users in the DB are = " +  collegeService.fetchUsersList().stream().count();
    }
    
//    delete all users at once
    @DeleteMapping("/deleteAll")
    public String deleteAllUsers(){
    	collegeService.deleteAllUsers();
        return "Deteled all users from the Database";
    }

//    custom API from the JPA Repository
    
//    find user by userName
    @GetMapping("/findUserByName/{name}")
    public CollegeModel fetchUserByName(@PathVariable("name") String userName){
        return collegeService.fetchUserByName(userName);
    }
    
//    delete user by userName
    @DeleteMapping("/deletebyName/{name}")
    public String deleteUserByName(@PathVariable("name") String userName){
    	CollegeModel found_user = collegeService.fetchUserByName(userName);
        collegeService.deleteUserById(found_user.getUserId());
        return "User " + found_user.getUserName() +" has Deleted User successfully";
    }

}
