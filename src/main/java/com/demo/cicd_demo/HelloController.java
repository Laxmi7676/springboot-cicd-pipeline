package com.demo.cicd_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from CI/CD Pipeline!";
    }

    @GetMapping("/status")
    public String status() {
        return "App is running successfully!";
    }
}
