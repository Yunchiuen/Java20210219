package com.ocp.day05;

import java.util.Scanner;

public class ScannerStudy {

    public static void main(String[] args) {
        Scanner sc = new Scanner("170.0 60 小明的資料 明天228放假");
        double a = sc.nextDouble();
        int b = sc.nextInt();
        String c = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("請輸入任意字串...");
        String ac2 = new Scanner(System.in).nextLine();
        System.out.printf("你所輸入的是: %s\n", ac2);
    }
}
