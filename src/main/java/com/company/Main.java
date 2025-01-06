package com.company;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Person
        Person person = new Person("Олександр", 45, "чоловік", "Вчитель");
        System.out.println("Інформація про Person:");
        person.info();
        System.out.println("toString(): " + person);

        // Створюємо об'єкт класу Student
        Student student = new Student("Іван", 20, "чоловік", "Комп'ютерні науки");
        System.out.println("\nІнформація про Student:");
        student.info();
        student.study();
        System.out.println("toString(): " + student);

        // Створюємо об'єкт класу Cadet
        Cadet cadet = new Cadet("Петро", 22, "чоловік", "Військова справа", "Сержант", "База 7");
        System.out.println("\nІнформація про Cadet:");
        cadet.info();
        cadet.serve();
        System.out.println("toString(): " + cadet);

        // Перевіряємо метод equals() і hashCode()
        System.out.println("\nПеревірка методів equals() і hashCode():");
        Cadet anotherCadet = new Cadet("Петро", 22, "чоловік", "Військова справа", "Сержант", "База 7");
        System.out.println("Cadet дорівнює anotherCadet: " + cadet.equals(anotherCadet));
        System.out.println("hashCode cadet: " + cadet.hashCode());
        System.out.println("hashCode anotherCadet: " + anotherCadet.hashCode());
    }
}
