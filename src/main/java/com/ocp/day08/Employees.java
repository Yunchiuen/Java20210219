package com.ocp.day08;

import java.util.stream.Stream;

public class Employees {

    private String[] employees = {"John", "Mary", "Helen"};

    //2.自己建立一個實例(static)
    private static Employees _instance = new Employees();

    //設定private建構子
    private Employees() {

    }

    //提供一個public static 方法讓外界得到你建立的唯一物件
    public static Employees getEmployees() {
        return _instance;
    }

    public void print() {
        Stream.of(employees)//串流
                .forEach(s -> System.out.println(s));
        //Stream.of(employees).forEach(System.out::println);//方法參照

    }
}
