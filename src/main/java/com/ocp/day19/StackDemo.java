package com.ocp.day19;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        //堆疊先進後出
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);//新增
        }
        System.out.println(stack);
        while (!stack.empty()) {            
            int value=stack.pop();//堆疊先刪除此頂部的對象，並將該對像作為此函數的值返回。
            System.out.println(value+" "+stack);
        }
    }

}
