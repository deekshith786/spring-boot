package com.example.gradle_project.UserService;

import com.example.gradle_project.UserModel.Users;
import com.example.gradle_project.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> fetchallUsers() {
        return userRepository.findAll();
    }

    public Users addNewUser(Users user) {
        return userRepository.save(user);
    }

    public Users findByuserName(String userName) {
        return userRepository.findByuserName(userName);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteUserWithName(String userName) {
        userRepository.deleteByuserName(userName);
    }
}
