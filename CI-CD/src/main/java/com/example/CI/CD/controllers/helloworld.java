package com.example.CI.CD.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/myapp")
public class helloworld {
    @PostMapping("/print")
    public String hello_world()
    {
        return "hello world";
    }
    }
    

