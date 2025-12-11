package com.JavaBasics.OOPS_JAVA_Abstraction;

public class InterfaceConcept {
    public static void main(String[] args) {
        Animal2 a1 = new Cat2();   // upcasting to interface
        Animal2 a2 = new Dog2();

        a1.sound();  // Meow
        a1.eat();

        a2.sound();  // Bark
        a2.eat();
    }
}

// Interface : blueprint(dancha) create karna taki koi class uss blueprint ko use kar sake to define its own structure.

// Class : is a blueprint to create objects
// Interface : is a blueprint to create class.

// Interface
interface Animal2{
    void sound();       // abstract by default
    void eat();         // abstract by default
}

// Cat implements Animal
class Cat2 implements Animal2 {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

// Dog implements Animal
class Dog2 implements Animal2 {
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}


/*
Interface has abstract methods , static constants, static methods , default methods .

1. Abstract Methods

    Definition:
    Methods without a body. Every class implementing the interface must override them.

    Example:

    interface Animal {
        void sound();   // abstract method (no body)
    }

    class Cat implements Animal {
        @Override
        public void sound() {
            System.out.println("Meow");
        }
    }

    Key point: Core purpose of an interface. Forces every implementing class to provide behavior.

2. Static Constants

    Definition:
    Variables in an interface are implicitly:
            public , static , final

    They become constants, shared across all implementing classes.

    Example:

    interface Animal {
        int LEGS = 4;     // public static final automatically
    }

    Usage:

    System.out.println(Animal.LEGS);

    Key point: You cannot change them; they are fixed constants.

3. Static Methods (Java 8+)

    Definition:
    Methods defined with static keyword.
    They belong to the interface itself, not to the implementing classes , can be called using interface name only in main().

    Example:

    interface Animal {
        static void info() {
            System.out.println("Animals are living beings.");
        }
    }

    class Cat implements Animal {}
    // inside Main.java:
    public class Main {
        public static void main(String[] args) {
            Animal.info();   // called using interface name only
        }
    }

    Key point:
    Static interface methods cannot be called using objects or references.

4. Default Methods (Java 8+)

    Definition:
    Methods with a body inside the interface.
    Used to provide default behavior to all implementing classes.

    Example:

    interface Animal {
        default void sleep() {
            System.out.println("Animal is sleeping.");
        }
    }

    class Dog implements Animal {
        // inherits sleep() automatically
    }

    Usage:

    Animal a = new Dog();
    a.sleep();  // prints: Animal is sleeping.

    Key point:
    A class may override the default method if it wants to change behavior.

 */