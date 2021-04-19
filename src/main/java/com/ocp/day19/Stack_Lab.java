package com.ocp.day19;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Lab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //堆疊先進後出
        System.out.print("請輸入:");
        Stack<Character> stack = new Stack<>();
        String s = sc.next();
        char[] array = s.toCharArray();//將字串轉換成字元
        for (char c : array) {
            stack.push(c);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }

    }
}
