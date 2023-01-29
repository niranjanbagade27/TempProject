package com.temp.project.designpatterns.adapter.currencyconverter;

public class DollarPaymentProcessor implements PaymentProcesor{
    @Override
    public void pay(double dollar) {
        System.out.println("Paying int dollars "+dollar);
    }
}
