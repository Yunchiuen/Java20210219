package com.ocp.day16;

public class PersonMain {
    public static void main(String[] args) {
        //Person p1=new Person("John", 170.0, 60);
        Person p1=new Person("John", 170.0, 60.0);
        
        Person p2=new Person("John", 170.0, 60.0);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println();
    }
}
