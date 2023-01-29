package com.temp.project.java8.practice.interfaces;

public class InterfaceTest implements A,B{

    @Override
    public void m(){
        System.out.println("My overriden method");
    }

    public static void main(String[] args) {
        new InterfaceTest().m();
    }
}
