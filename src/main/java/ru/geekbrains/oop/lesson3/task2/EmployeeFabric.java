package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;
import java.util.WeakHashMap;

public class EmployeeFabric {

    private static final Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 66);
        int randValue = random.nextInt(101);
        Employee result;
        if(randValue < 51) {
            result = Worker.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary, age);
        }else {
            result = Freelancer.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary/100, age);
        }
        return result;
    }
    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            employees[i] = generateEmployee();
        }
        return employees;
    }
}
