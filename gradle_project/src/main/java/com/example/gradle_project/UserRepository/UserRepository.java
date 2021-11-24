package com.example.gradle_project.UserRepository;

import com.example.gradle_project.UserModel.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByuserName(String userName);

    void deleteByuserName(String userName);
}
