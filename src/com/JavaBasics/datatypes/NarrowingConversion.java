package com.JavaBasics.datatypes;

public class NarrowingConversion {
    public static void main(String args[]){
        System.out.println("Narrowing conversion Example:");

        double doubleValue2 = 123.456;   // value holding variable ka space reduce karna .
        //  this type of consersion is explicit conversion where you are facing some loss :
        float floatValue2 = (float) doubleValue2; // Narrowing conversion from double to float .
        long longValue2 = (long) floatValue2;     // Narrowing conversion from float to long .
        int intValue2 = (int) longValue2;         // Narrowing conversion from long to int .
        System.out.println("double: " + doubleValue2);
        System.out.println("float: " + floatValue2) ;
        System.out.println("long: " + longValue2) ;
        System.out.println("int: " + intValue2);
        System.out.println();
    }
}
