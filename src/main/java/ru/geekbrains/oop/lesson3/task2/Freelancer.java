package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    private String jobTitle = "Фрилансер";
    private Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    public static Freelancer create(String surName, String name, double salary, int age){
        return new Freelancer(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        double result = salary*20*8;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s; возраст: %d ставка: %.2f руб.; заработная плата: %.2f руб.",
                jobTitle, surName, name, age, salary, calculateSalary());
    }
}
