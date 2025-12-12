package com.JavaBasics.MultiThreading;

// How to Implement Multithreading ;
public class b {
    public static void main() {
        long startTime = System.currentTimeMillis();

        // Task 1:
        long sum = 0;
        for (int i = 1; i <= 1000000000; i++) {
            sum++;
        }
        System.out.println("Sum : " + sum);

        // Task 2:
        long count = 0;
        for (long i = 1; i <= 500000000; i++) {
            if (i % 10 == 7) count++;
        }
        System.out.println("Count of numbers ending with 7" + count);

        System.out.println("Time Taken = " + (System.currentTimeMillis() - startTime));
    }
}

/*
To Create New Thread in java either extend the current thread class or create new Runnable interface.

// in above program we have two tasks executing one by one through single main thread but we can employee two different threads
to do these two different tasks simultaneously using multiThreading in java.

one way to create new thread is extend the thread class
other way is to use runnable interface
so there is a example of including both in this backage.
 */
