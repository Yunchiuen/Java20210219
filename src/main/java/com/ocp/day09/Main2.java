package com.ocp.day09;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("john", new Salary(30000, 5000));
        Employee e2 = new Employee("Mary", new Salary(70000, 8000));
        Employee e3 = new Employee("Heln", new Salary(50000, 6000));
        Employee[] itemployee = {e1, e2};
        Employee[] salesemployee = {e2, e3};
        int sum=Stream.of(itemployee)
                .mapToInt(e -> e.getSalary().getMoney())
                .sum();//將串流轉換int
        System.out.println(sum);
        //Stream.of(itemployee).forEach(s -> System.out.println(s.getSalary().getMoney()));
        //java 8 統計資料
        IntSummaryStatistics is=Stream.of(itemployee)
                .mapToInt(e -> e.getSalary().getMoney())
                .summaryStatistics();
        System.out.println(is);
    }
}
