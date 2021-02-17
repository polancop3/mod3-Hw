package com.example.server.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nba")

public class NbaController {
    @GetMapping
    public String sayHello(){
        return "yerr";
    }

}
