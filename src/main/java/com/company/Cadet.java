package com.company;

public class Cadet extends Student {
    String rank;

    public Cadet(String name, int age, String gender, String course, String rank) {
        super(name, age, gender, course);
        this.work = "Курсант";
        this.rank = rank;
    }

    public void serve() {
        System.out.println(name + " служить з рангом: " + rank);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ранг: " + rank);
    }
}
