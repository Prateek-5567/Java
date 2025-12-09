package com.JavaBasics.datatypes;

public class b_ClassBasedDataTypes {
    public static void main(String args[]){
        // String
        // Class based data Types :  two ways to create :
        String s1 = "Hello";        // using string literal
        String s2 = new String("Hello"); // using class constructor.
        System.out.println(s1 + ' ' + s2 );

        // as you know jvm is responsible to run you bytecode ie actual execution .
        // IN JVM : the space to create objects of Classes is called heap memory.
        // object are created in heap memory in jvm;

        // There is a Part of Heap Memory called String Pool.
        // STRING POOL VS HEAP MEMORY:-
        /*
            String Pool
                A special area inside the heap.
                Stores only literal strings and interned strings.
                Avoids duplicates → same literal points to the same object.
                Faster access, memory-efficient.

            Heap (General Heap Memory)
                Stores all objects, including Strings created with new.
                Every new String("abc") creates a separate object, even if same content exists in pool.
                No automatic deduplication.
            Core distinction
            Pool = shared, deduplicated, optimized.
            Heap = normal object storage, each object separate.
         */

        String str1 = "Prateek";
        String str2 = "Prateek";
        // now acc to string pool s1 and s2 belongs to same memory ie same object Literal in String Pool Memory.
        // lets modify one check other
        System.out.println(str1==str2);  // true; not bec they have same value moreover yaha object references compare ho rhe h ; true because they points to same memory in String pool.(same object)
        str2="Jaat";
        System.out.println(str1+str2);
        // to modify karne se unlink bhi ho ja rhe h yee. : ab vo alag alag hai
        System.out.println(str1==str2);

        String str3 = new String("Prateek"); // created in heap memory not in String Pool.
        System.out.println(str1==str3);  // false as they are two diffrent objects bhale hi value same ho.

    // very imp point : when write str1 == str2 values are not compared : String is a class and String s="abc"
    // - will create object literal and str1 == str2 will compare refrences of two objects not values.


            // so str1==str3 will also compare object references i.e address .; what if i want to compare values of object;
        System.out.println(str1.equals(str3)); // true;

        String a = "hello";
        a.toUpperCase();  // note : this did not worked why ? String Literals are immutable can Not be modified this way.
        System.out.println(a);
        a = a.toUpperCase(); // but can be forced to modify.
        System.out.println(a);

        // imp point:
        /*
        Immutable means cannot be changed after creation.
        In Java:
        When you modify a String, you’re not changing the original — you’re creating a new string object.
        String a="aditya";
        a="abhi" // creating a new String Literal Not modifying the previous one.
         */
    }
}
