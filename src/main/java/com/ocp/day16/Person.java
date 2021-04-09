package com.ocp.day16;

public class Person {

    private String name;
    private Double h;
    private Double w;

    public Person() {
    }

    public Person(String name, Double h, Double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public double getH() {
        return h;
    }

    public Double getW() {
        return w;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setW(Double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", h=" + h + ", w=" + w + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {//obj是否繼承Person
            Person p = (Person) obj;
            //參考型態比較要加doubleValue()
            if (name.equals(p.name) 
                    && h.doubleValue() == p.h.doubleValue() 
                    && w.doubleValue() == p.w.doubleValue()) {
                return true;
            }
        }
        return false;
    }

}
