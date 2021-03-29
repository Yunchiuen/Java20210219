package com.ocp.day15;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaDemo {

    public static void main(String[] args) {
        Integer[] radius = {5, -10, 15};
        Supplier<Double> supplier=()->Math.PI;//Supplier供應商 供應你一個公式
        Stream.of(radius)
                .filter(t -> t > 0)//Predicate filter跟if有關回傳bool   過濾剩下{5,15}
                .mapToDouble(t -> Math.pow(t, 2) * supplier.get())//Function 你寫的函數
                .forEach(System.out::println);//Consumer 接受並實作
        
    }
}
