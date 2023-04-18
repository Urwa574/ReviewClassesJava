package com.syntax;

public class repl211 {
    public static void main(String[] args) {
        //Create a program that will handle exception to match below output:
        //
        //Expected Output:
        //
        //```
        //java.lang.ArrayIndexOutOfBoundsException: 4
        //	at Main.main(Main.java:5)
        int a []= new int[1];
        try {
            a[11]=20;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
