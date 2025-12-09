package com.JavaBasics.datatypes;

public class f_MoreCode {
    public static void main(){
        float a = 10/3; // gives warning as rhs = int and lhs = float : memory loss => erroneous
        //float b = 10.0 / 3.0; // this is sure error as required type os float but if you do not
        // mention decimals are treated as double
        float c =10.0f/3; // correct
        System.out.println(a+c);

    }
}
