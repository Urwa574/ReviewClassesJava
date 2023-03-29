package com.syntax;

import java.util.HashMap;
import java.util.Map;

public class repl205 {
    //Create a HashMap of String.
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
    //Print all the values in upper case using entrySet
    public static void main(String[] args) {
        Map<String,String> address=new HashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");
        var country=address.entrySet();
        for (var c:country){
            System.out.println(c.getValue().toUpperCase());
        }
    }
}
