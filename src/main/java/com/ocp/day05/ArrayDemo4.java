package com.ocp.day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ArrayDemo4 {

    public static void main(String[] args) {
        int[] scoure1 = {81, 90, 90, 50, 100, 40};
        System.out.printf("分數 %s\n", Arrays.toString(scoure1));
        int max = 0;
        for (int i : scoure1) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
        int min = scoure1[0];
        for (int i : scoure1) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
        
        //java 8
        max=IntStream.of(scoure1).max().getAsInt();
        min=IntStream.of(scoure1).min().getAsInt();
        System.out.printf("最高分: %d\n",max);
        System.out.printf("最低分: %d\n",min);
        //java 8統計物件
        IntSummaryStatistics stat=IntStream.of(scoure1).summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getAverage());
        //modern java recipes pdf
    }
}
