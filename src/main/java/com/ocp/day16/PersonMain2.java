
package com.ocp.day16;

import java.util.function.DoubleUnaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class PersonMain2 {
    public static void main(String[] args) {
        Person[][] people={{new Person("john",170.0 , 60.0)
                ,new Person("Mary",150.0 , 50.0)
                ,new Person("Hean",160.0 , 80.0)}//A班
                ,{new Person("Yun",180.0 , 80.0)
                ,new Person("cool",160.0 , 58.0)}};//B班
        //計算5個人bmi
        ToDoubleFunction<Person> getBmi=(p)->p.getW()/Math.pow(p.getH()/100, 2);
        DoubleUnaryOperator fbmi= bmi -> Math.round(bmi*100)/100.0;
        Stream.of(people)
                .flatMap(p -> Stream.of(p))//平面轉換
                .mapToDouble(getBmi)
                .map(fbmi)//4捨5入
                .forEach(System.out::println);
    }
}
