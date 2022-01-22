package com.example.helloworld.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendStringController {
    //get -- frontend just get info from backend
    //post -- frontend send info to backend and backend send info back

    @PostMapping("/alterString")
    public String alterString(@RequestBody String animal){
        if (animal.equalsIgnoreCase("dog")){
            return "Yo dog is fun";
        }else{
            return "meat on the table";
        }
    }

    //Requirements
    //1. need create a get endpoint that generate a random number and return to backend
    //2. need to create a get endpoint that take in a path variable which is a number and depend on the number it generates how many random numbers
    //   For example, path number is /5 then result must be  random 5 different numbers ---- 4 19 46 12 4
    // what happen if people send something that is not a number? you need to catch the error.
    //3. create a post endpoint that do anything you want but make it fun
}
