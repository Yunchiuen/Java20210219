package com.ocp.day24;

//要給執行序執行工作的任務
public class Programming implements Runnable {

    @Override
    public void run() {
        String tname=Thread.currentThread().getName();
        System.out.println(tname+"寫java程式");
            
//        Runnable report=new Report();
//        report.run();
//        Runnable report=new Report();
//        Thread mary2=new Thread(report, "Mary");
//        mary2.start();
        
    }

}
