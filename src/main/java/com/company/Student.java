package com.company;

public class Student extends Person {
    String course;

    public Student(String name, int age, String gender, String course) {
        super(name, age, gender, "Student");
        this.course = course;
    }

    public void study() {
        System.out.println(name + " вчиться на курсі: " + course);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Курс: " + course);
    }
}
