package com.ocp.day13;

public interface Animal {

    void move();
    //介面預設方法實作
    default void eat(){
        System.out.println("吃罐頭食品");
    }
}
