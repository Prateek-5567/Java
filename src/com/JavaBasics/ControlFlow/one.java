package com.JavaBasics.ControlFlow;

public class one {
    public static void main(){
        int day=3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("Good Morning");
                break;
        }
            // ternary operator :
                int a = 10;
                boolean isEven = (a%2==0)?true:false;
                String str = (a%2!=0)? "odd":"even";
                System.out.println(isEven);
                System.out.println(str.toUpperCase());

    }
}
