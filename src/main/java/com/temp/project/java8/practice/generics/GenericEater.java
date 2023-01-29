package com.temp.project.java8.practice.generics;

public class GenericEater<T extends Animal> {
    public <T extends Animal> void  whatAreYouEating(T animal){
        animal.eat("rice");
    }
}
