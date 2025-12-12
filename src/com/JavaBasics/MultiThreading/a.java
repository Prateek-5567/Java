package com.JavaBasics.MultiThreading;
import com.JavaBasics.OOPS_JAVA.Animal;
public class a {
    public static void main(){
        Animal animal1 = new Animal();
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName()); // op : main
        // main thread begins running immediately as java program starts.
    }
}
/*
Notes:
Core is the individual processing unit of cpu which performs actual bit processing;
Modern day CPU's can have multiple cores to enable them to do multiple tasks simultaneously.
A program is the set of instructions that tells the compute how to perform a specific task;
eg. MS word is program that allows users to create and edit documents.

Process : program under execution ; when a program runs the operating system creates a process to manage its execution.
 => Within a Process multiple tasks execute simul.

Thread : is the smallest unit of execution within a process. A process may have multiple threads, which share the same
    resource but may run independently.

Computer ko kya kaam karna h vo batane ke lie hamne program banya; jab program execute ho rha hota h to that is called process.

* Different tabs in a modern web browser run in different processes, not just threads.
Why processes, not threads?
    Threads share memory.
    If one tab crashes or has malicious code, it could corrupt the entire browser.

    Processes do not share memory by default.
    This isolates failures and improves security.

So modern browsers (Chrome, Edge, Firefox multiprocess mode) use:
    Separate process per tab
    Separate process per extension
    Separate process per renderer (HTML/CSS/JS engine)
    Sometimes shared processes for low-memory devices

What about threads?

Inside each process, the browser internally uses multiple threads:
    UI thread
    Network thread
    JavaScript engine thread
    Raster/compositing threads
    Worker threads (for JS Web Workers)

But the isolation between tabs is achieved at the process level, not thread level.

CPU switches between tasks so quickly that it seems like multitasking.

Multitasking allows an operating system to run multiple processes(tasks) simultaneously.
 On single-core CPUs, this is done through rapidly switching between tasks.
  On multi-core CPUs, true parallel execution occurs, with tasks distributed across cores.
   The OS scheduler balances the load, ensuring efficient and responsive system performance.
*/

/*
Multithreading refers to executing multiple theads simultaneously in a single process.
eg. A web browser can use multithreading by having separate threads for
rendering the page, running JavaScript, and managing user inputs. This makes the browser more responsive and efficient.

Multitasking can be achieved through multithreading where each task is divided into threads that are managed concurrently.
While multitasking typically refers to the running of multiple applications,
multithreading is more granular, dealing with multiple threads within the same process.
 */

/*
Java provides robust support for multithreading, allowing developers to create applications
that can perform multiple tasks simultaneously, improving performance and responsiveness.

Java's multithreading capabilities are part of the java.lang package, making it easy to implement concurrent execution.

In a single-core environment, Java's multithreading is managed by the JVM and the os, which switch between threads
 to give the illusion of concurrency.
The threads share the single core, and time-slicing(kisko kitne time ke lie cpu milega- cpu scheduling) is used
 to manage thread execution.

In a multi-core environment, Java's multithreading can take full advantage of the available cores.
The JVM can distribute threads across multiple cores, allowing true parallel execution of threads.

When a Java program starts, one thread begins running immediately, which is called the main thread.
This thread is responsible for executing the main method of a program.

 */