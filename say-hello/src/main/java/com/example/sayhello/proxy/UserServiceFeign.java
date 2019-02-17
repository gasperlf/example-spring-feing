package com.example.sayhello.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "http://user-service", configuration = FeignLogConfiguration.class)
public interface UserServiceFeign {

    @GetMapping(path = "/user-service/{user}")
    ResponseEntity<String> getGreetings(@PathVariable String user);
}
