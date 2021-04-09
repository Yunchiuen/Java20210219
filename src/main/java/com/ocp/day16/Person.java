package com.ocp.day16;

import java.util.Objects;

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

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Person) {//obj是否繼承Person
//            Person p = (Person) obj;
//            //參考型態比較要加doubleValue()
//            if (name.equals(p.name)
//                    && h.doubleValue() == p.h.doubleValue()
//                    && w.doubleValue() == p.w.doubleValue()) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override //離散數學 2質數相乘*物件int型別
//    public int hashCode() {
//        return 7 * 11 * name.hashCode() * h.intValue() * w.intValue();
//    }
    //自動產生

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.h);
        hash = 47 * hash + Objects.hashCode(this.w);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.h, other.h)) {
            return false;
        }
        if (!Objects.equals(this.w, other.w)) {
            return false;
        }
        return true;
    }
    
}
