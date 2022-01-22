package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContorller {

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "hello world";
    }
}
