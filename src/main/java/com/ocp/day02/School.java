package com.ocp.day02;

public class School {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        //s1.SchoolName="台大";
        //s2.SchoolName="師大";
        Student.SchoolName="成大";
        s1.name="jo";
        s1.age=15;
        s1.print();
        s2.print();
    }

}
