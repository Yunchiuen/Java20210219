package com.lab.decorator;
//配菜
public class SideDish extends Food{
    private Food food;

    public SideDish(Food food) {
        this.food = food;
    }
    
    @Override
    public String getName() {
        return food.getName()+" + "+name;
    }

    @Override
    public int getPrice() {
        return price+food.getPrice();
    }
    
}
