package com.temp.project.java8.practice.streams;

public class Student {

    private int rno;
    private int name;
    private int marks;

    public Student(int rno, int name, int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name=" + name +
                ", marks=" + marks +
                '}';
    }
}
