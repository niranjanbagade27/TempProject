package com.temp.project.designpatterns.adapter.currencyconverter;

public class RupeePaymentProcessor implements PaymentProcesor{
    @Override
    public void pay(double inr) {
        System.out.println("Paying in rupees "+inr);
    }
}
