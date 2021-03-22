package com.lab.lab1;

public class Manange extends Employee {

    private int budget;

    public Manange() {
    }

    public Manange(int salary) {
        setSalary(salary);
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        if (budget > 0) {
            this.budget = budget;
        }
    }

}
