/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day10;

/**
 *
 * @author student
 */
public class Overloading {

    public static void print(Integer x) {
        System.out.println("Integer " + x);
    }

    public static void print(int x) {
        System.out.println("int: " + x);
    }

    public static void print(double x) {
        System.out.println("double " + x);
    }

    public static void print(float x) {
        System.out.println("float " + x);
    }

    public static void main(String[] args) {
        print(100);//基本資料型別會優先比對 int float double
    }
}
