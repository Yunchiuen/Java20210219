package com.ocp.day06;

public class StringCompare {
    
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = "java";
        String s4 = "java";//POOL
        String s5 = "Java";
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("--String POOL--");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println("-----");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println("--把s1丟進字串詞裡面--");
        System.out.println(s1.intern() == s3);//把s1丟進字串詞裡面
        System.out.println("--忽略大小寫--");
        System.out.println(s2.equalsIgnoreCase(s5));//忽略大小寫
        System.out.println(s4.toUpperCase() == s5.toUpperCase());
        System.out.println(s4.toLowerCase().equals(s5.toLowerCase()));
        
        
    }
}
