package com.example.helloworld.request;

public class PayOffRequest {
    private Integer oweAmount;
    private Double interestRate;
    private Integer minimumPay;

    public Integer getOweAmount() {
        return oweAmount;
    }

    public void setOweAmount(Integer oweAmount) {
        this.oweAmount = oweAmount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getMinimumPay() {
        return minimumPay;
    }

    public void setMinimumPay(Integer minimumPay) {
        this.minimumPay = minimumPay;
    }
}
