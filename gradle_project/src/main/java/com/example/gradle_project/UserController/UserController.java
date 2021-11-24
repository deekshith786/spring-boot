package com.example.gradle_project.UserController;

import com.example.gradle_project.UserModel.Users;
import com.example.gradle_project.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<Users> getallUsers() {
        return userService.fetchallUsers();
    }

    @PostMapping("/add")
    public Users createUsers(@RequestBody Users user) {
        return userService.addNewUser(user);
    }

    @GetMapping("/user/{name}")
    public Users getUserByUserName(@PathVariable("name") String userName){ return userService.findByuserName(userName); }

    @GetMapping("/count")
    public String getAllUsersCount(){
        return "The available users in the DB are = " +  userService.fetchallUsers().stream().count();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long Id){
        userService.deleteUser(Id);
        return "Deleted successfully";
    }

    @DeleteMapping("/deletebyName/{name}")
    public String deleteUserByName(@PathVariable("name") String userName){
        Users found_user = userService.findByuserName(userName);
        userService.deleteUser(found_user.getUserId());
        return "User " + found_user.getUserName() +" has Deleted User successfully";
    }
}
