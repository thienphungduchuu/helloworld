package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class RandomNumberController {

    @GetMapping("/RandomNumber")
    public int RandomNumer(){

        Random rand = new Random();
        int random_value = rand.nextInt(100);

        return random_value;
    }
}
