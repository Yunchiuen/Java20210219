package com.ocp.day06;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultArray {

    public static void main(String[] args) {
        int[][] scores = {{100, 90}, {80, 70}, {60, 50}};
        System.out.println(scores.length);

        for (int[] s : scores) {
            System.out.println(Arrays.toString(s));
        }
        //請算出總分
        int sum = 0;
        for (int[] score : scores) {
            for (int s : score) {
                sum += s;
            }
        }
        System.out.println("總分: " + sum);
        //java 8 (1)
        int sum2 = 0;
        for (int[] score : scores) {
            sum2 += IntStream.of(score).sum();
        }
        System.out.println(sum2);
        
        //java 8 (2)   flatMapToInt
        int sum3=Stream.of(scores).flatMapToInt(s -> IntStream.of(s)).sum();
        System.out.println(sum3);
        int sum4=Stream.of(scores).flatMapToInt(IntStream::of).sum();
        System.out.println(sum4);
    }
}
