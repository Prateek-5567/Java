package com.JavaBasics.OOPS_JAVA;

// we can define access modifiers for attributes and methods.
// constructor is used to initialise a new object ; the object declare must have the parameters matching to one of the constructor of class.

public class Car {

    int speed;
    private String color;
    // Note: Private methods can be set only while object declaration i.e using constructor

    Car(){
        // default constructor
    }

    Car(String color){
        // parameterised constructor
        this.color=color;
        // this is a pointer to current object particularly which you are creating.
    }

    void drive(){
        System.out.println("Car has speed : "+speed+" ; and color : "+color);
        System.out.println("Driving the car!!");
    }

    // if you want to update or access private attributes you need getters and setters.
    void setColor(String color){
        if(color.toLowerCase()=="red"){
            System.out.println("Sorry! red color is not allowed"); return;
        }
        this.color=color;
    }
    String getColor(){
        return this.color;
    }

}

//NOTES :
// encapsulation : hiding attributes and methods using access modifiers like private or protected to restrict direct their access outside class.
