package com.lab.decorator;

public class SubWay {

    public static void main(String[] args) {
        Food food = new Bread();
        food = new Ham(food);
        food = new Lettuce(food);
        food = new Olives(food);
        food = new Tomato(food);
        food = new Tomato(food);
        food = new Tuna(food);
        food = new Tuna(food);
        food = new Tuna(food);
        food = new Onian(food);
        food = new Onian(food);
        System.out.printf("商品: %s\n總價: %d元\n", food.getName(), food.getPrice());
    }
}
