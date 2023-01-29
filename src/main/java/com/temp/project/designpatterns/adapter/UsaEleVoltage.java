package com.temp.project.designpatterns.adapter;

public class UsaEleVoltage implements Voltage{
    @Override
    public int supportedVoltage() {
        return 110;
    }
}
