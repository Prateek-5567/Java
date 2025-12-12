package com.JavaBasics.OOPS_JAVA;

/*
Polymorphism works through upcasting
Animal a1 = new Cat();
Call -> a1.sound() runs Cat’s version.
 */
/*
ek class ke andar multiple classes bana sakte h, just make sure public class sirf ekk hi ho jiska name same as file ho
 */
public class polymorphism {
    // polymorphism allows methods to perform different tasks based on the object that calls them
    // Compile Time : Method Overloading ;
    // Runtime : eg Methods Over-riding ;
//    -> in Runtime , a subclass provides a specific implementation of a methods already defined in its parent class.
//    -> The methods to be called is determined at runtime based on the object.
    public static void main() {
        Animals human = new Animals();
        Animals billi = new Cat(); // Object Cat() class ka create kar rahe hai aur daal rahe h Animals le reference m
        Animals sheru = new Lion(); // upcasting.

        /*
        2. Animals billi = new Cat();
            This is upcasting.
            Right side: new Cat() → actual object is Cat.
            Left side: Animals → reference type is Animals (parent).
            Effect:
                You can only access methods/fields defined in Animals, not those exclusive to Cat (unless overridden).
                If Cat overrides a method of Animals, the Cat version will run. This is runtime polymorphism.
                Cat ke khud ke attributes and methods ko access nahi kar sakte app if object is declared using upcasting.
         */

        human.sound();
        billi.sound();
        sheru.sound();
    }
}
// you can not create Animal class again it is already defined in current package(folder).
class Animals{
    void sound(){
        System.out.println("Animal makes some sound!");
    }
}
class Cat extends Animals{
    void sound(){
        // Cat class overrides the definition of sound method of its parent class.
        System.out.println("cat meows!");
    }
}
class Lion extends Animals{
    void sound(){
        // Lion ke sound ne Animals ke sound method ko override kia.
        System.out.println("Lion Roars!");
    }
}
