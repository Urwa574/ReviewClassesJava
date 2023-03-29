package com.syntax;

import java.util.HashSet;
import java.util.Set;

public class repl197 {
    //Create a set collection in which you do not want to preserve or sort the order and add below values to it.
    //
    //Red
    //
    //Pink
    //
    //Yellow
    //
    //White
    //
    //Black
    //
    //Print set collection
    //
    //And get total number of colors available in the set
    public static void main(String[] args) {
        Set<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");
        System.out.println("Original Hash Set: "+colors);
        System.out.println("Size of the Hash Set: "+colors.size());
    }
}
