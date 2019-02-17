package com.example.user.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(path = "/user-service/{user}")
    public ResponseEntity<String> getGreetings(@PathVariable String user){
        return ResponseEntity.status(HttpStatus.OK).body(String.format("Hi %s welcome to Spring Wold's", user));
    }
}
