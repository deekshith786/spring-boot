package com.lincker.provider.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linckr")
public class ProviderService {

  @PostMapping(value = "/")
  public ResponseEntity<String> defaultInformationRequest(){
    return ResponseEntity.ok("Default Request information");
  }

  @PostMapping(value = "/v1/requests")
  public ResponseEntity<String> informationRequest(){
    return ResponseEntity.ok("Post Request information");
  }

  @GetMapping(value = "/v1/requests")
  public ResponseEntity<String> getRequest(){
    return ResponseEntity.ok("get Request information");
  }
  
  @GetMapping("/user")
  public ResponseEntity<String> usesrPage(){ return ResponseEntity.ok("From the userPage"); }

  @GetMapping("/admin")
  public ResponseEntity<String> adminPage(){ return ResponseEntity.ok("From the adminPage"); }

}
