package com.JavaBasics.Collection_frameworks;

import java.util.*;

public class SetMethodsDemo {
    public static void main(String[] args) {

        // Create a HashSet
        Set<String> set = new HashSet<>();

        // 1. add(element)
        set.add("A");
        set.add("B");
        set.add("C");

        // Duplicate add is ignored (no error)
        set.add("A");    // Set still: A, B, C

        System.out.println("Current set := "+set);

        // 2. contains(element)
        boolean hasB = set.contains("B");

        // 3. remove(element)
        set.remove("C");  // removes C

        // 4. size()
        int count = set.size(); // 2

        // 5. isEmpty()
        boolean empty = set.isEmpty();

        // 6. iterator() – safe removal
        Iterator<String> it = set.iterator();  // created a iterator object of String type
        while(it.hasNext()) {
            String val = it.next();
            if (val.equals("B"))
                it.remove();  // remove using iterator only
        }
        // set now: A

        // 7. addAll(collection)
        Set<String> extra = new HashSet<>(); // again: Set is interface ; HashSet is class that inherits from Interface Set
        extra.add("X");
        extra.add("Y");
        extra.add("A");  // duplicate, ignored

        set.addAll(extra); // A, X, Y

        // 8. removeAll(collection)
        Set<String> toRemove = new HashSet<>();
        toRemove.add("X");
        set.removeAll(toRemove);  // removes X (common elements gets removed.)

        // 9. retainAll(collection) → intersection
        Set<String> filter = new HashSet<>();
        filter.add("A");
        filter.add("Z");
        set.retainAll(filter);  // keeps only A (only common elements gets retained).

        // 10. clear()
        // set.clear();  // uncomment to empty

        // Print final status
        System.out.println("Final Set: " + set);        // [A]
        System.out.println("Contains B: " + hasB);
        System.out.println("Size: " + count);
        System.out.println("Is Empty: " + empty);

        // HashSet does not guarantee the order of inserted elements but LinkedHashSet maintains the order using node and pointers concept.
        Set<String> LLset = new LinkedHashSet<String>();


        String[] str = {"12","23"};
//        System.out.println(str); op : [Ljava.lang.String;@8efb846
    }
}
