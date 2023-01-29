package com.temp.project.java8.practice.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        Integer ans = list.stream().filter(e -> e%2==0).sorted((e1,e2)->Integer.compare(e2,e1)).findFirst().orElse(-1);
        System.out.println(ans);
        List<Integer> list2 = list.stream().map(e -> e*2).collect(Collectors.toList());
        System.out.println(list2);
        list2.stream().reduce((e1,e2)->e1).stream().forEach(System.out::println);

        List<Student> students = List.of(new Student(1,1,10),new Student(2,2,20)
                ,new Student(3,3,30),new Student(4,4,40));

        Optional<Student> s = students.stream().sorted((e1, e2)-> e2.getMarks()-e1.getMarks()).filter(e->e.getRno()%2==0).findFirst();

        System.out.println(s);

        Map<Integer,Integer> map = students.stream().collect(Collectors.toMap(Student::getRno, Student::getName));
        System.out.println(map);

    }
}
