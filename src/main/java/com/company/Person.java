package com.company;

public class Person {
    String name;
    int age;
    String gender;
    String work;

    public Person(String name, int age, String gender, String work) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.work = work;
    }

    public void info() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Стать: " + gender);
        System.out.println("Робота: " + work);
    }
}