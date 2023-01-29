package com.temp.project.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface Adder{
    public int add(int a, int b);
}


public class StaticClass {
    static class InnerClass{

    }

    public static void main(String[] args) {
        Adder adder = (a,b) -> {
            return (a + b);
        };
        System.out.println(adder.add(3,4));

        Predicate<Integer> pred = (t) -> t%2==0;

        List<Integer> ls = Arrays.asList(1,2,3,4,5);

        ls.forEach(num -> System.out.println(pred.test(num)));

//        System.out.println(pred.test(3));
        System.out.println("-------------------");
        ls.stream().filter((t) -> t%2==0).forEach(t -> System.out.println(t));


    }
}
