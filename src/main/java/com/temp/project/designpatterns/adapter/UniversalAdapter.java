package com.temp.project.designpatterns.adapter;

public class UniversalAdapter implements Voltage{

    Voltage volt;

    public UniversalAdapter(Voltage v){
        this.volt = v;
    }

    @Override
    public int supportedVoltage() {
        return volt.supportedVoltage();
    }
}
