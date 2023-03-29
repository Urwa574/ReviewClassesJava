package com.syntax;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class repl199 {
    //Create a Set collection in which you want to preserve an order of inserted String Objects.
    //
    //Add the below values
    //
    //- null
    //- Sohil
    //- Diego
    //- Alijon
    //- Asel
    //- Sumair

    //Print values 1 by 1 using loop and Iterator
    public static void main(String[] args) {
        Set<String> names=new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");
        for (String name:names){
            System.out.println(name);
        }
      Iterator<String> name=names.iterator();
        while (name.hasNext()){
            String n=name.next();
            System.out.println(n);
        }

    }
}
