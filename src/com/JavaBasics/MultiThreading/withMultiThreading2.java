package com.JavaBasics.MultiThreading;

public class withMultiThreading2 extends Thread{
    private Counter counter;

    withMultiThreading2(Counter counter){ // constructor of this class only that expects a Counter type object
        this.counter = counter;
    }
    // ye class ek counter object expect karti h for its every object jispe ye run() method call kregi always
    //    withMultiThreading2 ye class extend karti h Thread class ko to isme run() method implement karsakte h

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
//            this.counter.increment();
            this.counter.incrementSync();
        }
    }

    public static void main(){
        Counter counter = new Counter();
        withMultiThreading2 thread1 = new withMultiThreading2(counter);
        withMultiThreading2 thread2 = new withMultiThreading2(counter);
// both share same object counter.

        // ideally if you start both these threads then they should run simultaneously and thread1 takes count from 1 to 1000 and thread2 takes count from 1000 to 2000
        // but this does not appear to happen
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join(); // use join to stop the main thread until jispe join lagaya hai uska execution pura ho jaye.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(counter.getCount()); // output ayegi 1670 for counter.increment()
// because : first main thread starts thread1 which executes increment some number of times
        // then main thread starts thread2 which executes increment some more number of times
        // but for those times in which both 1 and 2 are executing they are accessing shared resource : count, of common object counter.
        // when shared resource is accessed then both calls increment method at exact sametime due to which count (the shared resource) gets incremented only once in those calls.

        System.out.println(counter.getCount()); // synchronised method called : op : 2000
    }
}

class Counter{
    private int count;

    Counter(){
        count=0;
    }
    public void increment(){count++;} // same time pe multiple threads can access this method so : Critical section problem arise.
    public synchronized void incrementSync(){count++;} // now this method is synchronized so only one thread can access this methods at a given time.
    public void decrement(){count--;}
    public int getCount(){return count;}
}