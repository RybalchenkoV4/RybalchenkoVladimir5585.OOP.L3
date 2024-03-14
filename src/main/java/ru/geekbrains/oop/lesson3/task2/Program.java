package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(10);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees/*, new SalaryComparator()*/);

        System.out.println();
        System.out.println("***");
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Comparator ageSort = new AgeComparator();
        Arrays.sort(employees, ageSort);

        System.out.println();
        System.out.println("***");
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
