package com.JavaBasics.Collection_frameworks;

import java.util.*;

public class a_one {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1); // cpp me append thaa...
        arr.add(21);
        arr.add(321); // adds at end.
        System.out.println(arr); // cpp we can not directly print a collection but in java you can.

        // Create ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // 1. add(element)
        list.add("A");
        list.add("B");
        list.add("C");

        // 2. add(index, element)
        list.add(1, "X");    // A, X, B, C

        // 3. get(index)
        String first = list.get(0);     // returns "A"

        // 4. set(index, element)
        list.set(2, "UpdatedB");        // A, X, UpdatedB, C

        // 5. remove(index)
        list.remove(3);           // remove "C"

        // 6. remove(Object)
        list.remove("X");            // removes X

        // 7. size()
        int count = list.size();        // count elements

        // 8. contains(Object)
        boolean hasA = list.contains("A");

        // 9. isEmpty()
        boolean empty = list.isEmpty();

        // 10. clear()
        // list.clear();  // uncomment to empty list

        // 11. indexOf(Object)
        list.add("A");
        list.add("B");
        int idxA = list.indexOf("A");   // first occurence index of A

        // 12. lastIndexOf(Object)
        int lastA = list.lastIndexOf("A");

        // 13. addAll(Collection)
        ArrayList<String> extra = new ArrayList<>();
        extra.add("D");
        extra.add("E");
        list.addAll(extra);             // append all

        // 14. iterator() – safe removal
        Iterator<String> it = list.iterator(); // Iterator is class , String is also class said as wrapper class in this case.
        while(it.hasNext()) {
            String s = it.next();
            if (s.equals("B")) it.remove();
        }

        // Print final list
        System.out.println("Final List: " + list);
        System.out.println("Size: " + count);
        System.out.println("Contains A: " + hasA);
        System.out.println("Is Empty: " + empty);
        System.out.println("Index of A: " + idxA);
        System.out.println("Last Index of A: " + lastA);

        List<Integer> arr2 = new ArrayList<Integer>(); // List is a interface so we are creating a object of ArrayList class with referece to List
        arr2.add(10);
        arr2.add(20);
        arr.addAll(arr2);
        System.out.println(arr);

        /*
        by default array list of capacity 10 is created when it gets filled => size becomes 1.5 times.
        to avoid this capacity headache use LinkedList inbuilt in java
         */
        List<Integer> ll1 = new LinkedList<Integer>();
        // same nodes and all linking and next ptr.
    }
}
