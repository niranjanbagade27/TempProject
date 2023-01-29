package com.strategy.design.pattern;

public class Employee {

    private String name;
    private String email;

    public Employee(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
