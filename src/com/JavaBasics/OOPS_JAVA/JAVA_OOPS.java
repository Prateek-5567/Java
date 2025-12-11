package com.JavaBasics.OOPS_JAVA;
// java revolves heavily around classes and objects
// OOP : A programming paradigm that uses classes and objects to design and implement software solutions.
// OOPS : done in self notes + OOD notes
public class JAVA_OOPS {
    public static void main(){
        // there is a Car class in same folder so you can access it directly
        Car siera = new Car("yellow");
        siera.speed=120;
        siera.drive();

        siera.setColor("red");
        System.out.println(siera.getColor()); // private data can be accessed outside the class using getters and setters.

        siera.setColor("White");
        System.out.println(siera.getColor());

        Dog sherry = new Dog();
        sherry.eat(); // inheritance most basic eg.

    }
}
