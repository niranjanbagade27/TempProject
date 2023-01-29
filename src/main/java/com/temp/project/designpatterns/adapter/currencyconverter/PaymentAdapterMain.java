package com.temp.project.designpatterns.adapter.currencyconverter;

public class PaymentAdapterMain {
    public static void main(String[] args) {
        new InrToDollarConverter(new DollarPaymentProcessor()).pay(100);
    }
}
