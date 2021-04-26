package com.ocp.day21;

public class AppleShare2 {

    public static void main(String[] args) {
        int n = 0;//人數
        try {
            sunmit(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(System.out);//印出程式碼詳細錯誤資訊
        }
    }

    public static void sunmit(int n) throws Exception {
        if (n <= 0) {
            Exception e = new Exception("n<=0");
            throw e;
        }
        int apple = 10;
        int result = 0;
        result = apple / n;
        System.out.println(result);
    }
}
