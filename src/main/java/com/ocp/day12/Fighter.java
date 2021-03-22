package com.ocp.day12;
//戰鬥機
public class Fighter implements Weapon {

    @Override
    public void shoot() {
        System.out.println("發射飛彈");
    }
}
