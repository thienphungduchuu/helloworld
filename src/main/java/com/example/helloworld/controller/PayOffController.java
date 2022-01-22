package com.example.helloworld.controller;


import com.example.helloworld.request.PayOffRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayOffController {

    @PostMapping("/PayOff")
    public String payoff (@RequestBody PayOffRequest request){

        int monthsValue = 0;
        double interest = 0;
        double currentOwe = request.getOweAmount();

        while (currentOwe > 0) {
            System.out.print(currentOwe);
            //interest = the amount has to pay every month
            interest = (currentOwe * (request.getInterestRate() / 100)) / 12;

            if (interest > request.getMinimumPay())
                return "The minimum pay is lower than interest!!!";

            currentOwe = currentOwe - request.getMinimumPay() + interest;
            monthsValue++;
        }

        return Integer.toString(monthsValue);
    }




}
