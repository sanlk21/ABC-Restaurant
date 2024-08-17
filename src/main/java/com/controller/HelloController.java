package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Spring Boot";
    }

    @PostMapping("/hello")
    public String postRequest() {
        return "This is a POST request to Hello endpoint";
    }
    
}
