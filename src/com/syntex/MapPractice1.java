package com.syntex;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice1 {
    public static void main(String[] args) {
//Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.

        Map<String,String> countries=new TreeMap<>();
        countries.put("Pakistan","Islamabad");
        countries.put("USA","NewYork");
        countries.put("Canada","Toronto");
        countries.put("Australia","Sydney");
        System.out.println(countries);
        System.out.println("*************");
        //2
        var entries=countries.entrySet();
        for(var enterySet:entries){
            System.out.println(enterySet.getKey()+" "+enterySet.getValue());
        }
        var iterator=entries.iterator();
        while(iterator.hasNext()){
            var all=iterator.next();
            System.out.println(all.getKey()+" "+all.getValue());
        }System.out.println("2");

     //3
    var values=countries.values();
        for(var value:values){
            System.out.println(value);
        }
    var itera=values.iterator();
        while (itera.hasNext()){
            var val=itera.next();
            System.out.println(val);
        }
    }
}
