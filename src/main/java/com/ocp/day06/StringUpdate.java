package com.ocp.day06;

public class StringUpdate {

    public static void UpdateString(String x) {
        x = x.concat("8");
    }

    public static String UpdateString2(String x) {
        x = x.concat("8");
        return x;
    }

    public static void UpdateStringBuilder(StringBuilder y) {
        y = y.append("8");
    }

    public static void main(String[] args) {

        String x = "java";
        StringBuilder y = new StringBuilder("java");
        UpdateString(x);
        UpdateStringBuilder(y);
        System.out.println(x);
        System.out.println(y);
        x = UpdateString2(x);
        System.out.println(x);
    }
}
