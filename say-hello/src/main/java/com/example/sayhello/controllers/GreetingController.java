package com.example.sayhello.controllers;

import com.example.sayhello.proxy.UserServiceFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {

    @Autowired
    private UserServiceFeign userServiceFeign;


    @GetMapping(value = "/greeting/{user}")
    public ResponseEntity<String> greet(@PathVariable String user) {
        log.info("Access /greeting");
        ResponseEntity<String> responseEntity = userServiceFeign.getGreetings(user);
        return responseEntity;
    }

    @GetMapping(value = "/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }
}
