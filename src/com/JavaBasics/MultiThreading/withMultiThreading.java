package com.JavaBasics.MultiThreading;

public class withMultiThreading {
    public static void main(){
        // Call those two classes Task1 and Task2 here
        // If your class extends Thread class then you can directly run their object using .start() method
        // If your class implements Runnable interface then you need to pass its object to thread class's constructor to create a new thread and on that thread you can use .start() method.

        long startTime = System.currentTimeMillis();

        Task1 thread_taskOne = new Task1(); // extends Thread class for multithreading : directly thread create hoga
        Task2 taskTwo = new Task2(); // implements Runnable interface for multithreading
        Thread thread_taskTwo = new Thread(taskTwo); // esse hoga thread create for Runnable .

        thread_taskOne.start(); // main thread start this new thread1
        thread_taskTwo.start(); // main thread starts this new thread2
        // these two tasks will execute asynchronously (side by side both will run in diff. thread )
        // main thread comes here but i want the main thread to wait unit both above gets completed:-

        try {
            thread_taskTwo.join();
            thread_taskOne.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Time Taken = "+ (System.currentTimeMillis()-startTime)); // 897ms (much lesser time in multithreading)

    }
}
