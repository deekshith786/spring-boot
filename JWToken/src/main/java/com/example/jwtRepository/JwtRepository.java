package com.example.jwtRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.JwtModel;

public interface JwtRepository extends JpaRepository<JwtModel, Long>{

}
