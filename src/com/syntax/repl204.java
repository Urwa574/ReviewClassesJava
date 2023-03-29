package com.syntax;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class repl204 {
    //Create a Map that will preserve an order of entry objects
    //
    //Add below pair to it .
    //
    //"Street" = "Patrick ST"
    //
    //"Suite" = "265"
    //
    //"City" = "Vienna"
    //
    //"Zip" = "22180"
    //
    //"Country" = "United State"
    //
    //Print all values using iterator
    public static void main(String[] args) {
        Map<String,String> address=new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");
        Iterator<Map.Entry<String,String>> entryIterator=address.entrySet().iterator();
       while (entryIterator.hasNext()) {
           var entry = entryIterator.next();
           System.out.println(entry.getValue());
       }
    }
}
