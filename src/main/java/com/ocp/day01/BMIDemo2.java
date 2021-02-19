package com.ocp.day01;

public class BMIDemo2 {

    public static void main(String[] args) {
        printBMI("john", 170, 80);
        printBMI("Yun", 160, 50);
        printBMI("Helen", 160, 70);
    }

    public static void printBMI(String name, double height, double weight) {

        double result = weight / Math.pow(height / 100, 2);
        System.out.printf("%s的身高 : %.1f 體重: %.1f bmi: %.2f\n", name, height, weight, result);
    }
}
