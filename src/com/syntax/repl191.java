package com.syntax;

import java.util.ArrayList;
import java.util.Iterator;

public class repl191 {
    public static void main(String[] args) {
        //Create an ArrayList of type boolean called listA and add below values
        //(true, false, false)
        //Create another array list call listB and ad all values from List A into it
        //Using iterator print all values from ListB 1 by 1
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        ArrayList<Boolean> listB=new ArrayList<>(listA);

        Iterator<Boolean> values=listB.iterator();
        while (values.hasNext()){
            System.out.println(values.next()+" ");
        }

    }
}
