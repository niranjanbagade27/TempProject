package com.temp.project.java8.practice.generics;

public class Cat implements Animal{
    @Override
    public void eat(String food) {
        System.out.println("Cat eating "+food);
    }
}
