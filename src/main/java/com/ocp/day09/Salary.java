package com.ocp.day09;

public class Salary {
    private int principalsalary;//本薪
    private int bonus;

    public Salary(int principalsalary, int bonus) {
        this.principalsalary = principalsalary;
        this.bonus = bonus;
    }
    
    public int getMoney(){
        int money=Util.add(principalsalary, bonus);
        return money;
    }
    
}
