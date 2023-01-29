package com.temp.project.java8.practice.generics;

import java.util.ArrayList;

public class GenericsMain {
    public static void main(String[] args) {
        GenericEater<Animal> eater = new GenericEater<>();
        eater.whatAreYouEating(new Dog());
    }
}
