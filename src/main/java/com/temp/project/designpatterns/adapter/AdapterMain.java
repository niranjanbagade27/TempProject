package com.temp.project.designpatterns.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println(new UniversalAdapter(new IndianEleSystem()).supportedVoltage());
        System.out.println(new UniversalAdapter(new UsaEleVoltage()).supportedVoltage());
    }
}
