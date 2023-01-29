package com.temp.project.java8.practice.generics;

public class Dog implements Animal{
    @Override
    public void eat(String food) {
        System.out.println("Dog eating "+food);
    }
}
