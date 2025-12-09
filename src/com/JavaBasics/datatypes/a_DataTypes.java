package com.JavaBasics.datatypes;

public class a_DataTypes {
    public static void main(){
        System.out.println("hi");

        // int 4 bytes
        // long 8 bytes
        // float 4 bytes
        // double 8 bytes
        // boolean 1 byte
        // char 2 byte

        // ye sab to same as cpp ; two new : byte(1 byte) and short(2 byte)
        /* BYTE :
           -> In Java, the byte data type is a primitive integer type that represents very small whole numbers.
           -> byte stores 8 bits (1 byte) of data.
           -> It is a signed type (can hold both positive and negative numbers).
           -> range : -128 to 127 ; 2^-7 to 2^7 - 1 ; 1 byte = 8 bits and 1 is used for sign so left 7;
           -> similarly int : 4byte = 32bits = 2^-31 to 2^31-1 ; 31 bits storage 1 bit sign.
           -> byte a = 128 ; gives error.
           -> use case : memory efficiency and binary data handling
         */
        byte a= 10;
        System.out.println("Minimum byte value"+Byte.MIN_VALUE);
        System.out.println("Max byte value"+Byte.MAX_VALUE);

        // NOTE : KOI BHI PRE-DEFINED `CLASS` ACCESS KAROGE TO ALWAYS WRITE FIRST LETTER CAPITAL
                // EG : Short , Byte , String , Integer , Boolean etc.

        // Short :-
//        as it is of 2 bytes = 16 bits and 1 for sign so range is 2^-15 to 2^15 - 1 ;
//        short is a primitive integer type in Java.
//        When you need to save memory compared to int (e.g., large numeric arrays).
//        When working with binary data or hardware-level data (e.g., sensors, sound samples, etc.).
        /*
        In arithmetic expressions, all short operands are automatically promoted to int.
        Example:
                short a = 1000;
                short b = 2000;
                // short c = a + b; // ❌ Compile-time error
                int c = a + b;     // ✅ Works
         */

        short b = 200;
        System.out.println(b);
        System.out.println(Short.MAX_VALUE);  // 32767

        /*
        int byte boolean char short etc. all these are primitive data types in old traditional java
        but they were not able to fulfill modern day coding needs so correspoding to all these traditional
        primitive data types classes were created with fixed pattern  :  first letter capital means you are accessing
        the class.
        Moreover for some Complex data types also classes were created for them only classes are present char / Char esse 2 occurences nahi h inki.
        eg String  , Array , Map , Set , etc.
        to methods vgera kabhi bhi access karo to class use karlena
        variable assign karo to primitives ke lie int char ye datatypes use karo
        bakio ke lie class hi use karo ; class ka object jese banta h vese bankte h unke variables  ; actually they are objects only

         */

//        String a =4;  // esse nahi banta object.
        String str = new String("jai hind");
        System.out.println(str);

//        primitive data types ke lie bhi object bana sakte h
        Integer it = new Integer(19);
        System.out.println(it);
//
//        thats the reason why java is not pure Object Oriented language because there are primitive data types.

/*  In Pure Object Oriented Languages there must be no primitive datatypes ; even int, bool etc. these must be classes only not primitive datatypes.
        ->Java breaks this rule.
              Java has 8 primitive types: byte, short, int, long, float, double, char, boolean.
              These are stored as raw values, not as objects, not created using new, and they do not belong to any class.
        ->Java introduced wrapper classes (Integer, Boolean, etc.) to provide object versions, but primitives still exist.
              Their existence means Java is not purely object-oriented, only object-based with OOP features.
* */
        long lg = 23232l;  // last me l dinotes that it is long otherwise it is considered as integer.
        float fl = 23.423f; // float value : use f at end.
        double db = 20.2025;
        boolean bl = true;

        // char se integer value mapped hai how to get that ? same as cpp : explicit type casting
        char c = 'k';
        System.out.println( (int)'a'); // 97 -> a ; same ascii codes.
        System.out.println((int)Character.MIN_VALUE);    // 0
        System.out.println((int) Character.MAX_VALUE);    // 65535 : but it is saved in from of some character I need to typecast to int
//         0 to 127 is a subset of this char range(0-65535) that is called ASCII range.
        System.out.println((char) 10084); // type cast int to char.

//        char ch2 = "dsj"; //  this is erroneus :  you can only store chars here : single char ; and single quotes.
//        char is 2 byte.
//        char ch2 = 'as'; // error.

        // #########################################################################


    }
}
