package com.JavaBasics.datatypes;

public class e_WideningConversion {
    public static void main(String args[]){

        // widening conversion is int can hold short value without any data loss ; short can hold byte ; so on..
        // this widening of data variable is widening conversion.
        System.out.println("Widening conversion Example:");
        System.out.println("----------");
        byte byteValue = 10; // 1 byte // A cup
        short shortValue = byteValue; // 2 bytes // glass
        int intValue = shortValue; // 4 bytes // jug
        long longValue = intValue; // 8 bytes // bucket
        float floatValue = longValue; // 4 bytes
        double doubleValue = floatValue; // 8 bytes
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println();
    }
}
