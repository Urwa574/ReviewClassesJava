package com.syntax;

import java.util.LinkedHashMap;
import java.util.Map;

public class repl200 {
    //Create A Map that will preserve an order of entry objects
    //
    //Add below pairs :
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
    //Print all values of from the map
    public static void main(String[] args) {
        Map<String,String> address=new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");
        var country=address.entrySet();
        for (var c:country){
            System.out.println(c.getValue());
        }
    }
}
