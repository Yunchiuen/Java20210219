
package com.ocp.day28;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCar {
    public static void main(String[] args) {
        int n = 2;
        CyclicBarrier cb = new CyclicBarrier(n);
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
    }
   
    
}
