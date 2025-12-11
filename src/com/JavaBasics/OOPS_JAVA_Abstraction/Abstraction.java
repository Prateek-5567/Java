package com.JavaBasics.OOPS_JAVA_Abstraction;

public class Abstraction {
    public static void main(String[] args){
        Animal a1 = new Cat();   // upcasting //  you definately can NOT create object of Animal class as it is Abstract class; this object is of Cat class and have reference of Animal.
        Animal a2 = new Dog();   // upcasting

        a1.sound();  // Meow       → runtime polymorphism
        a1.eat();    // inherited concrete method

        a2.sound();  // Bark → runtime polymorphism
        a2.eat();    // inherited concrete method
    }

}
/*
Abstraction focuses on showing only essential details while hiding the implementation.
It is achieved through abstract classes and objects.
=> Internal details can be hidden using two ways : (1) Abstract class and (2) Interface.

Abstract Class :
 - Declared using the abstract keyword.
 - Can include both abstract methods(methods without body) and concrete methods(ones wth body).
 - Cannot be instantiated directly.
 - Acts as a blueprint for subclasses, which must implement the abstract methods.

Key Points (Understand These, Don’t Memorize)

    Abstract class cannot be instantiated
    Animal a = new Animal(); → NOT allowed.

    Abstract class can have both abstract and concrete methods
    Here, sound() is abstract, eat() is concrete.

    Child classes MUST override all abstract methods
    Cat and Dog must implement sound().

Template idea:
Abstract class defines what must exist (eg : sound), subclasses define how it behaves (meow/bark).
 */

abstract class Animal {
    // abstract class defines what must exist in all the classes that inherit from it.
    // abstract method (no body)
    abstract void sound();

    // concrete (normal) method
    void eat() {
        // you can ovveride this eat() methods that is called polymorphism.
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

// Child class 2
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}