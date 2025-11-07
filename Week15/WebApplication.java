## Simple REST API using Spring Boot  
Demonstrates a basic **Spring Boot REST controller** with `@RestController` and `@GetMapping`.  
Takes two query parameters `a` and `b` from the URL, calculates their **sum**, and returns a formatted response.  
Shows how to handle **HTTP GET requests** and **request parameters** using `@RequestParam`.  
#Java #SpringBoot #RESTAPI #WebDevelopment #Backend


package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebApplication {
    @GetMapping("/hello")
 public String r(@RequestParam int a,@RequestParam int b)
 {
        int sum = a + b;     
    return String.format("Name:N.D.Nitesh Roll N0:2024503529  A: %d B:%d Sum: %d", a, b, sum); 
    
 }
}
