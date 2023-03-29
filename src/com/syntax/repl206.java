package com.syntax;

import java.util.HashMap;

public class repl206 {
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
    //Using entry set print key and values pairs using loop
    //Remove below from Map
    //"ONE"
    //
    //"FOUR"
    //
    //Using entry set print key and values pairs using loop
    public static void main(String[] args) {
        HashMap<String,String> values=new HashMap<>();
        values.put("ONE","AAA");
        values.put("TWO","BBB");
        values.put("THREE","CCC");
        values.put("FOUR","DDD");
        values.put("FIVE","EEE");
        var entry=values.entrySet();
        for (var e:entry){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println("_____________________");
        values.remove("ONE");
        values.remove("FOUR");
        var val=values.entrySet();
        for (var e:entry){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
