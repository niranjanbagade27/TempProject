package com.temp.project.designpatterns.builder;

public class Student {
    private int sid;
    private int name;
    private String addr;
    private int percentage;

    private Student(StudentBuilder builder){
        this.sid = builder.sid;
        this.name = builder.name;
        this.addr = builder.addr;
        this.percentage = builder.percentage;
    }

    public static class StudentBuilder{
        private int sid;
        private int name;
        private String addr;
        private int percentage;

        public StudentBuilder(int sid, int name){
            this.sid = sid;
            this.name = name;
        }

        public StudentBuilder addAddress(String addr){
            this.addr = addr;
            return this;
        }

        public StudentBuilder addPer(int percentage){
            this.percentage  = percentage;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

    public int getSid() {
        return sid;
    }

    public int getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public int getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name=" + name +
                ", addr='" + addr + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public static void main(String[] args) {
        Student s = new StudentBuilder(1,1).addAddress("address").addPer(20).build();
        System.out.println(s);

        s = new StudentBuilder(1,1).addAddress("address").build();
        System.out.println(s);
    }
}
