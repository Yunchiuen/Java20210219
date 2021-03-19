package com.lab1;

public class Main5 {

    public static void main(String[] args) {
        //取得公差員
        EmployeeUtil util = new EmployeeUtil();
        Employee emp = util.getRandomEmployee();
        System.out.println(emp.getClass().getSimpleName());
        System.out.println(emp.getSalary());
        if (emp instanceof Manange) {//instanceof判斷是否繼承
            Manange m = (Manange) emp;//將emp轉Manange
            System.out.println("Budget: " + m.getBudget());
        }
        if (emp instanceof Director) {//instanceof判斷是否繼承
            Director d = (Director) emp;//將emp轉Director
            System.out.println("StockOptions: " + d.getStockOptions());
        }
    }
}
