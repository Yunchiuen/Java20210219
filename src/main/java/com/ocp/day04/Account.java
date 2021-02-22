package com.ocp.day04;

public class Account {

    private int money = 100;

    //餘額查詢方法
    public void printMoney() {
        System.out.printf("$%d\n", money);
    }

    //提款方法
    public void withdrawal(int x) {
        System.out.printf("提款$ %d \n", x);

        if (x <= 0) {
            System.out.println("提款金額錯誤");
            return;
        }

        if (x > money) {
            System.out.println("提款金額不足");
        }

        if (x > 10_0000) {
            System.out.println("提款金額不超過10萬");
            return;
        }

        System.out.println("成功");
        money -= x;

    }
    
    //存款的方法
    public void deposit(int x){
        System.out.printf("存款$ %d \n", x);
        
         if (x <= 0) {
            System.out.println("存款金額");
            return;
        }

        if (x %100!=0) {
            System.out.println("存款金額必須是100的倍數");
        }

        if (x > 10_0000) {
            System.out.println("存款金額不超過10萬");
            return;
        }
        
        System.out.println("成功");
        money += x;
    }
}
