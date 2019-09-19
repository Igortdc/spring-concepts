package com.concepts.standard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/user")
  public ResponseEntity<String> index() {
    return ResponseEntity.ok("Greetings from Spring Boot!");
  }
}
