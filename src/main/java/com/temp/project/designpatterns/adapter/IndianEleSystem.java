package com.temp.project.designpatterns.adapter;

public class IndianEleSystem implements Voltage{
    @Override
    public int supportedVoltage() {
        return 240;
    }
}
