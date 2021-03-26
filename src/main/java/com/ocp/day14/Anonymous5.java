
package com.ocp.day14;

@FunctionalInterface//只能有一個抽象方法
interface BMI{
    double calc(double h,double w);
}
public class Anonymous5 {
    public static void main(String[] args) {
        //使用lambda實現bmi
        //身高170 體重60
        BMI bmi=(double h,double w)->{return w/Math.pow(h/100, 2);};
        System.out.printf("%.2f",bmi.calc(170, 60));
    }
}
