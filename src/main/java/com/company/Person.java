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

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "', work='" + work + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && gender.equals(person.gender) && work.equals(person.work);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 31 + gender.hashCode() + work.hashCode();
    }
}