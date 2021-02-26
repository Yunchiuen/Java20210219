
package com.ocp.day05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scoure1={81,90,90,50,100,40};
        System.out.printf("分數 %s\n",Arrays.toString(scoure1));
        //IntStream 串流
        int sum=IntStream.of(scoure1).sum();
        double avg=IntStream.of(scoure1).average().getAsDouble();
        System.out.printf("總分: %d\n",sum);
        System.out.printf("平均: %.1f\n",avg);
        //請問及格總分與平均
        sum=0;
        for(int a:scoure1){
            if(a>60){
                sum+=a;
            }
        }
        System.out.printf("及格總分: %d\n",sum);
        
        //java 8
        sum=IntStream.of(scoure1).filter(x->x>=60).sum();
        System.out.printf("及格總分: %d\n",sum);
        
        avg=IntStream.of(scoure1)
                .filter(x -> x>=60)//過濾及格分數
                .average()//取得平均
                .getAsDouble(); // 取得平均的 double 資料
        System.out.printf("平均: %.1f\n",avg);
    }
}
