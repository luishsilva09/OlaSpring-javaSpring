package com.hellospring.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/hello")
public class HelloSpring {
    @GetMapping
    public String Hello(){
        return "Olá Spring";
    }
}
