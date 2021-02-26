
package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scoure1={80,90,90,50,100,30};
        System.out.printf("分數 %s\n",Arrays.toString(scoure1));
        //Java 7 for loop
        int sum=0;
        for(int i=0,lens=scoure1.length;i<lens;i++){
            sum+=scoure1[i];
        }
        System.out.printf("總分: %d\n",sum);
        //Java 7 for each
        int sum2=0;
        for(int a:scoure1){
            sum2+=a;
        }
        System.out.printf("總分: %d\n",sum2);
        System.out.printf("平均: %.1f\n",(double)sum2/scoure1.length);
        
    }
}
