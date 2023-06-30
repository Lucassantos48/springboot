package com.savedeve.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola(){ 
        return "Ola, Spring Boot";
    }
    
}
