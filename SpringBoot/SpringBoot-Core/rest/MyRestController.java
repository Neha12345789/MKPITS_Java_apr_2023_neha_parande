package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("$(Stud.name)")
    private String naming;

   @GetMapping("/")
   public String display(){
       return "Spring Boot" + naming;

   }
}
