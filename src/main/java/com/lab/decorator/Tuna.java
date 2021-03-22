
package com.lab.decorator;
//鮭魚
public class Tuna extends SideDish{
    
    public Tuna(Food food) {
        super(food);
        super.name="鮭魚";
        super.price=25;
    }
    
}
