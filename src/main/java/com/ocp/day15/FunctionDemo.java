package com.ocp.day15;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Integer[] radius = {5, 10, 15};
        Consumer<Double> consumer = (r) -> System.out.println(r);
        Function<Integer, Double> function = (t) -> t * t * 3.14;
        //Function<Integer, Double> function = (t) -> Math.pow(t, 2)*Math.PI;
        print(radius, consumer, function);
    }

    public static void print(Integer[] radius,
            Consumer<Double> consumer,
            Function<Integer, Double> function) {
        for (Integer r : radius) {
            Double area = function.apply(r);
            consumer.accept(area);

        }
    }
}
