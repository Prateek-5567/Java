package com.JavaBasics.MultiThreading;

// here we use second method : implement runnable interface
public class Task2 implements Runnable{
    @Override
    public void run(){
        long count = 0;
        for (long i = 1; i <= 500000000; i++) {
            if (i % 10 == 7) count++;
        }
        System.out.println("Count of numbers ending with 7" + count);
    }
}
