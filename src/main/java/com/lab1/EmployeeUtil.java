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

    //取得所有經理預算Budget
    public int getAllBudget(Manange... manange) {
        return Stream.of(manange).mapToInt(m -> m.getBudget()).sum();
    }

    //取得所有董事的股票選擇權stockOptions
    public int getAllStockOptions(Director... directors) {
        return Stream.of(directors).mapToInt(Director::getStockOptions).sum();
    }
}
