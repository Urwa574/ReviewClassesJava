package com.syntax;

import java.util.LinkedHashMap;
import java.util.Map;

public class repl202 {
    //Create Map in which we want to store keys in Ascending order
    //
    //Add the below values
    //
    //1 item = apple
    //
    //2 item = banana
    //
    //3 item = pear
    //
    //4 item = tomato
    //
    //5 item = mango
    //
    //6 item: kiwi
    public static void main(String[] args) {
    Map<Integer,String> store=new LinkedHashMap<>();
    store.put(1,"apple");
    store.put(2,"banana");
    store.put(3,"pear");
    store.put(4,"tomato");
    store.put(5,"mango");
    store.put(6,"kiwi");
    var fruits=store.entrySet();
    for (var f:fruits){
        System.out.println("Key is "+f.getKey()+" item and values is "+f.getValue());
    }
}
}
