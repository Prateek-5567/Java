package com.JavaBasics.datatypes;

/*
Static Variables (Class Variables):-
    Belong to the class, not to any object. One single copy exists for all objects.
    Used for shared state across all instances (example: count of objects created).
    Initialized when the class is loaded. Lifetime = entire program run.
Static Methods (Class Methods):-
    Also belong to the class, not to objects. Called using class name.
    Cannot access non-static variables or instance methods because no object context exists.
    Used for utility functions or behavior that does not depend on object state (e.g., Math.max).
    Overloading allowed; overriding not allowed (because method dispatch is compile-time for statics).
*/
public class d_StringOperations {
    public static void main(String[] args) {
        // 1. Creation
        String s1 = "Java";  // string literal
        String s2 = new String("Java");  // string Object
        String s3 = "Programming";

        // 2. Length
        System.out.println("Length: " + s1.length()); // 4

        // aage jitne bhi ye operations h mostly me same string change nai ho rhi nai string create ho rhi h
        // .i.e sare methods object ka reference leke ya kuch input leke run ho rhe h aur kuch return bhi kar rhe h mostly string .

        // 3. Character Access
        System.out.println("Char at 2: " + s1.charAt(2));

        // 4. Comparison : *-> .equals() is important
        System.out.println("s1 == s2 : " + (s1 == s2)); // reference comparison
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // value comparison ; .equals() is a method.
        System.out.println("CompareTo: " + s1.compareTo("Java")); // 0 means equal
        System.out.println("Ignore Case: " + "java".equalsIgnoreCase("JAVA"));  // ignore Case and compare.

        // 5. Case Conversion
        System.out.println("Upper: " + s1.toUpperCase());
        System.out.println("Lower: " + s1.toLowerCase());

        // 6. Concatenation
        System.out.println("Concat: " + s1.concat(" Language"));
        System.out.println("Using + : " + (s1 + " Rocks"));

        // 7. Substring
        System.out.println("Substring (1,3): " + s1.substring(1, 3));  // cpp me substr thaa.

        // 8. Searching
        System.out.println("Index of 'a': " + s1.indexOf('a'));  // camel case notation
        System.out.println("Contains 'va': " + s1.contains("va"));
        System.out.println("StartsWith 'J': " + s1.startsWith("J"));
        System.out.println("EndsWith 'a': " + s1.endsWith("a"));

        // 9. Replace
        System.out.println("Replace 'a' with 'o': " + s1.replace('a', 'o'));
        System.out.println("Replace word: " + s3.replace("Programming", "Coding"));

        // 10. Trim
        String s4 = "   Hello World   ";
        System.out.println("Before trim: [" + s4 + "]");
        System.out.println("After trim: [" + s4.trim() + "]");

        // 11. Split
        String text = "Java-is-fun";
        // split will obv create a array:
        String[] parts = text.split("-");  // single quote me doge to error aa jayega.. char alag hai string alag h java me .
        for(String part : parts ){
            System.out.println(part);
        }

        // 12. Convert to Char Array
        char[] chars = s1.toCharArray();
        System.out.print("Char Array: ");
        for (char c : chars)
            System.out.print(c + " ");
        System.out.println(); // println adds a new line at end of whatever you are printing.

        // 13. ValueOf (convert to String)
        int num = 100;
        String strNum = String.valueOf(num);
        System.out.println("ValueOf int: " + strNum);

// jo class name ka use karke access ho vo static methods hote h .

        // 14. Join
        String joined = String.join(" - ", "C", "C++", "Java", "Python");
        System.out.println("Joined: " + joined);

        // 15. Intern
        String s5 = new String("Java").intern();
        System.out.println("Intern Check: " + (s1 == s5)); // true
        /*
        🔹 1. Basic Definition
            intern() is a method of the String class used to store or retrieve a string from the String Pool.
            String s1 = new String("Java"); // heap
            String s2 = s1.intern(); // string pool
            String s3 = "Java"; // literals are created in string pool : and "Java" already exists so reference is returned.

//      here we compare references : -
            System.out.println(s1 == s2); // false ; as they hold diffrent ref : one in heap other in string pool.
            System.out.println(s2 == s3); // true ; as they hold same ref.

        🔹 2. What Actually Happens Internally
            When you call s.intern(), the JVM does the following:
            Checks if the String Pool already contains a string equal to s.
            If yes, it returns the pooled reference.
            If no, it adds the string to the pool and returns that pooled reference.
            The String Pool is a special memory area inside the JVM heap used to store unique immutable string instances.

         */

        // 16. Empty and Blank check
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty: " + empty.isEmpty());  // camel case.
        System.out.println("isBlank: " + blank.isBlank());
    }
}
