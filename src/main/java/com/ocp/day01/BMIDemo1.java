package com.ocp.day01;

public class BMIDemo1 {

    public static void main(String[] args) {
        String name = "join";
        double height = 170;
        double weight = 60;
        double result = weight / Math.pow(height / 100, 2);
        System.out.printf("%s的身高 : %.1f 體重: %.1f bmi: %.2f\n", name, height, weight, result);

        String name2 = "mary";
        double height2 = 160;
        double weight2 = 48;
        double result2 = weight / Math.pow(height / 100, 2);
        System.out.printf("%s的身高 : %.1f 體重: %.1f bmi: %.2f\n", name2, height2, weight2, result2);

    }
}
