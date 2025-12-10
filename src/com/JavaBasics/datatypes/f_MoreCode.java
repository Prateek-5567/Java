package com.JavaBasics.datatypes;

public class f_MoreCode{
    public static void main(){
        float a = 10/3; // gives warning as rhs = int and lhs = float : no memory loss ; just warning for type mismatch(by syntax analyser)
        //float b = 10.0 / 3.0; // this is sure error as required type is float but if you do not
        // mention decimals are treated as double
        float c =10.0f/3; // correct
        System.out.println(a);
        System.out.println(a+c);

    }
}
