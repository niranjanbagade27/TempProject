package com.temp.project.java8.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Java8FilterDemoMain {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "a", 100),
                new Employee(2, "b", 200),
                new Employee(3, "c", 300),
                new Employee(4, "aa", 500)
        );
//
//        list.stream().forEach(employee -> {
//            employee.setSalary(employee.getSalary()*2);
//            System.out.println(employee);
//        });
//        list.stream().forEach(emp-> System.out.println(emp));
        Map<Integer, Employee> map = new HashMap();
        list.stream().forEach(e -> map.put(e.getId(), e));
//        map.entrySet().stream().forEach(System.out::println);


//        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName).reversed())).forEach(e->System.out.println(e));

    }
}
