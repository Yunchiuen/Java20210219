package com.ocp.day07;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeDemo2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Yun", "Java", 25, 80000);
        Employee e2 = new Employee("John", "Python", 30, 70000);
        Employee e3 = new Employee("Helen", "Java", 27, 60000);
        Employee e4 = new Employee("Anita", "Python", 21, 40000);
        Employee e5 = new Employee("Vincent", "Java", 35, 90000);

        //System.out.println(e1);
        Employee[] employees = {e1, e2, e3, e4, e5};
        System.out.println(employees);
        //for each
        for (Employee e : employees) {
            System.out.println(e);
        }
        //java 8
        Stream.of(employees)//串流
                .forEach(e -> System.out.println(e));
        Stream.of(employees).forEach(System.out::println);
                
    }

}
