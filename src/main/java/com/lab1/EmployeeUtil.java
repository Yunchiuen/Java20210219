package com.lab1;
//員工管理工具

import java.util.stream.Stream;

public class EmployeeUtil {

    //取得所有員工薪資
    public int getAllSalary(Employee... employees) {
        //java7
//        int sum=0;
//        for(Employee e:employees){
//            sum+=e.getSalary();
//        }
//        return sum;

        //java 8
        //return Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        return Stream.of(employees).mapToInt(Employee::getSalary).sum();
    }

    //取得所有經理薪資
    public int getAllSalary(Manange... manange) {
        return Stream.of(manange).mapToInt(m -> m.getSalary()).sum();
    }

    //取得所有董事薪資
    public int getAllSalary(Director... directors) {
        return Stream.of(directors).mapToInt(Director::getSalary).sum();
    }
}
