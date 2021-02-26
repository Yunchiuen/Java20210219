
package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //全班有六個人數學成績
        int[] scoure1={80,90,90,50,100,30};
        //全班有六個人國文成績
        int[] scoure2=new int[6];
        scoure2[0]=100;
        scoure2[1]=20;
        scoure2[2]=50;
        scoure2[3]=60;
        scoure2[4]=30;
        scoure2[5]=70;
        //列印成績
        System.out.printf("數學%s\n",Arrays.toString(scoure1));
        System.out.printf("國文%s\n",Arrays.toString(scoure2));
    }
}
