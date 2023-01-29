package com.temp.project.designpatterns.adapter.currencyconverter;

public class InrToDollarConverter implements PaymentProcesor{
    PaymentProcesor procesor;

    public InrToDollarConverter(PaymentProcesor p){
        procesor = p;
    }

    @Override
    public void pay(double inr) {
        double dollar = inr/80.0;
        procesor.pay(dollar);
    }
}
