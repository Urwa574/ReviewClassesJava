package com.syntax;

import java.util.HashSet;
import java.util.Set;

public class repl196 {
    public static void main(String[] args) {
        //Create a Set and and below values to it.
        //
        //[third, first, second]
        //
        //Print HashSet and then remove all the elements from Hashset and print it again.
        Set<String> values=new HashSet<>();
        values.add("third");
        values.add("first");
        values.add("second");
        System.out.println(values);
        values.clear();
        System.out.println(values);
    }
}
