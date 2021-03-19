package com.lab1;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee(30000);
        Employee e2 = new Employee(40000);
        Employee e3 = new Employee(50000);
        Employee e4 = new Manange(60000);
        Employee e5 = new Manange(70000);
        Employee e6 = new Director(100000);
        EmployeeUtil util = new EmployeeUtil();
        int sum=util.getAllSalary(e1,e2,e3,e4,e5,e6);
        System.out.println(sum);
    }
}
