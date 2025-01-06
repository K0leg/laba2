package com.company;

public class Cadet extends Student {
    String rank;
    String militaryBase;

    public Cadet(String name, int age, String gender, String course, String rank, String militaryBase) {
        super(name, age, gender, course);
        this.work = "Курсант"; // Перевизначаємо роботу
        this.rank = rank;
        this.militaryBase = militaryBase;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ранг: " + rank);
        System.out.println("Військова база: " + militaryBase);
    }

    public void serve() {
        System.out.println(name + " служить з рангом " + rank + " на базі " + militaryBase);
    }

    @Override
    public String toString() {
        return super.toString() + ", rank='" + rank + "', militaryBase='" + militaryBase + "'";
    }
}