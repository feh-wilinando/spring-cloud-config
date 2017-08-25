package com.domineospring.cloud.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${my.name}")
    private String name;

    @GetMapping("/say-my-name")
    public String sayMyName(){
        return name;
    }

}
