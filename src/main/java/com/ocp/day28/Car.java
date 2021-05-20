
package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Car extends Thread{
    //循環屏障
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        String tname=Thread.currentThread().getName();
        System.out.printf("%d從台北出發\n",tname);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%d到了台中\n",tname);
            cb.await(10, TimeUnit.SECONDS);
            //cb.await();
        } catch (Exception e) {
        }
        System.out.printf("%繼續往高雄出發\n",tname);
    }
    
    
}
