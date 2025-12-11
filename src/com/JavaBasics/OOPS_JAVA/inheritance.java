package com.JavaBasics.OOPS_JAVA;

public class inheritance {
    public static void main(){
        // write your code here.
    }
}

class Camera{
    void turnOn(){
        System.out.println("turning on");
    }
}
class Call{
    void turnOn(){
        System.out.println("turning on");
    }
}
class PlayMusic{
    void turnOn(){
        System.out.println("turning on");
    }
}

class MobilePhone extends Camera{
    // this is single level inheritance which is allowed
    void SwitchOn(){
        System.out.println("Power ON");
    }
}
// multilevel inheritance where C inherit from B and B inherits from A is allowed in java.
// But Multiple Inheritance is not allowed in Java ;
// REASON :
/*
class SmartPhone extends Camera,Call,PlayMusic{

}

SmartPhone SamsungS23 = new SmartPhone();
SamsungS23.turnOn(); this creates a conflict ; => turnOn methods is present in Camera,Call,PlayMusic so whose turnOn to call?
*/

