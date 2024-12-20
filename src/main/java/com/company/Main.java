package com.company;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Іван", 19, "чоловік", "Комп'ютерні науки");
        Cadet cadet = new Cadet("Петро", 22, "чоловік", "Комп'ютерні науки", "Сержант");

        System.out.println("Інформація про студента:");
        student.info();
        student.study();

        System.out.println("\nІнформація про курсанта:");
        cadet.info();
        cadet.serve();
    }
}
