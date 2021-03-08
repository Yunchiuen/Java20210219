package com.ocp.day07;

public class WrapperClassDemo {
    /*
    *   auto-boxing
    *   auto-unboxing
    */
    public static void main(String[] args) {
        //java 5 之前
        int a = 100;
        Integer b = new Integer(200);
        System.out.println(a + b.intValue());//java 5 之前
        System.out.println(a + b);//java 5 之後 auto-unboxing
        //Integer c = Integer.valueOf(300);//java 5 之後 取代 new Integer(300);
        Integer c = 300; //(auto-boxing)
        System.out.printf("int最大值: %d\n", Integer.MAX_VALUE);
        System.out.println(Integer.max(a, b));
        String chinese = "1";
        String math = "50";
        System.out.println(chinese + math);
        System.out.println(Integer.parseInt(chinese) + Integer.parseInt(math));
        System.out.println(Integer.toBinaryString(100));
    }
}
