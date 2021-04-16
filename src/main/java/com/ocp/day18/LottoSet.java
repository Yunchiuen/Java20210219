
package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LottoSet {
    public static void main(String[] args) {
        // 0~9 取出 5 個不重複的數字, 並放入到 LinkedHashSet 集合中存放
        Random r=new Random();
        Set<Integer> lotto=new LinkedHashSet<>();
        for(int i=0;i<5;i++){
            int n=r.nextInt(10);//0~9 隨機取
            System.out.printf("%d\n",n);
            lotto.add(n);//加入到集合
        }
        System.out.println(lotto);
        System.out.println(lotto.size());
        //使用while
        Set<Integer> lotto2=new LinkedHashSet<>();
        while (lotto2.size()<5) {            
            int n=r.nextInt(10);
            System.out.printf("n=%d\n",n);
            lotto2.add(n);//加入到集合
        }
        System.out.println(lotto2);
        System.out.println(lotto2.size());
    }
}
