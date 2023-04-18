package com.syntax;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class repl212 {
    public static void main(String[] args) {
        //Create a method that will not be handling exception and throwing it at caller.
        //In main method call method and handle the exception.
        //**Expected Output:**
        //java.io.FileNotFoundException:  (No such file or directory)

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }
}
