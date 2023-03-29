package com.syntax;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class repl207 {
    // Create Hash Map.
    //
    //add the follow values
    //
    //map.put("ONE","AAA");
    //
    //map.put("TWO","BBB");
    //
    //map.put("THREE","CCC");
    //
    //map.put("FOUR","DDD");
    //
    //map.put("FIVE","EEE");
    //
    //Using EntrySet print the key and values pairs using iterator only
    public static void main(String[] args) {
        HashMap<String,String> values=new HashMap<>();
        values.put("ONE","AAA");
        values.put("TWO","BBB");
        values.put("THREE","CCC");
        values.put("FOUR","DDD");
        values.put("FIVE","EEE");
        var entry=values.entrySet();
        System.out.println("HashMap Before Replace :");
        var iterator=values.entrySet().iterator();
        while (iterator.hasNext()){
            var value=iterator.next();
            System.out.println(value.getKey()+" : "+value.getValue());
        }
        //replace with below key THREE--> ASEL and key FIVE-->SUMAIR
        //
        //Using EntrySet print the key and values pairs using iterator only
        System.out.println("HashMap After Replace :");
        values.replace("THREE","ASEL");
        values.replace("FIVE","SUMAIR");
        var iterator1=values.entrySet().iterator();
        while (iterator1.hasNext()){
            var value=iterator1.next();
            System.out.println(value.getKey()+" : "+value.getValue());
        }


    }
}
