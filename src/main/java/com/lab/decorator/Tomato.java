
package com.lab.decorator;
//番茄
public class Tomato extends SideDish{
    
    public Tomato(Food food) {
        super(food);
        super.name="番茄";
        super.price=15;
    }
    
}
