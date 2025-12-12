package com.JavaBasics.MultiThreading;

// Thread is a inbuilt class in java we need to extend that into our class (inheritance) in order to have a new Thread

public class Task1 extends Thread{
    /**
     * public banana jruri h void run() ko nito conlfict karega inbuilt java.lang ke run() ke sath.
     */
    @Override
    public void run(){
        long sum = 0;
        for (int i = 1; i <= 1000000000; i++) {
            sum++;
        }
        System.out.println("Sum : " + sum);
    }
    // run method is also inbuilt in Thread class that we need to override to define our coustom task here.
}
