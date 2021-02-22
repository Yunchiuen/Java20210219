package com.ocp.day04;

public class ATM {
    public static void main(String[] args) {
        Account a=new Account();
        a.withdrawal(70);
        a.printMoney();
        a.withdrawal(-50);
        a.printMoney();
    }
}
