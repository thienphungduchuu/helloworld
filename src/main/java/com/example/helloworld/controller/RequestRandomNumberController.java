package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Random;

@RestController
public class RequestRandomNumberController {

    @PostMapping("/RequestRandomNumber")
    public int[] RequestRandomNumber(@RequestBody int count){

        Random rand = new Random();
        int value[] = new int[count];

        for (int i = 0; i < count; i++)
            value[i] = rand.nextInt(100);

        return value;
    }
}
