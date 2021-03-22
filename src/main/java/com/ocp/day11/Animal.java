
package com.ocp.day11;

public interface Animal {
    String name="動物";//屬性 public static final String name
    void sound();//抽象方法 public abstract
    void sleap();//抽象方法 public abstract
    default void info(){//介面的default實作方法(public static) for java8
        System.out.println("小小動物世界");
    }
    
}
