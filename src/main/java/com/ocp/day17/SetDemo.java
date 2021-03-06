package com.ocp.day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        //HashSet毫無順序
        //Set set=new HashSet();
        //集合裡面只能放物件型別
        Set set = new LinkedHashSet();
        set.add("國文");
        set.add(100);//Integer
        set.add("英文");
        set.add(90);
        set.add("數學");
        set.add(80);
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(null);
        System.out.println(set);
        //走訪元素
        //hasNext()跳下一個
        //iter.next() value
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
        System.out.println("二次調用");
        iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
        //指印出科目
        System.out.println("印出科目");
        iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof String) {
                System.out.println(next);
            }
        }
        System.out.println("計算總分");
        int sum=0;
        iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof Integer) {             
                sum+=(Integer)next;        
            }
        }
        System.out.println(sum);
        //java8 可以直接調用集合
        int sum2=set.stream()
                .filter(s ->s instanceof Integer)//確認有沒有Integer
                .mapToInt(s -> Integer.parseInt(s.toString()))//先把原先Object轉成Integer
                //.mapToInt(s -> (Integer)s)
                .sum();
        System.out.println(sum2);
    }
}
