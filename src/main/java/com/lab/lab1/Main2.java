package com.lab.lab1;

public class Main2 {
    public static void main(String[] args) {
        
        Manange m1=new Manange(60000);
        m1.setBudget(10_0000);
        Manange m2=new Manange(70000);
        m2.setBudget(20_0000);
        Director m3=new Director(80000);
        m3.setBudget(30_0000);
        EmployeeUtil util=new EmployeeUtil();
        System.out.println(util.getAllSalary(m1,m2,m3));
        System.out.println(util.getAllBudget(m1,m2,m3));
    }
}
