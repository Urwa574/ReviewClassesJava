package com.syntax.reveiw1;

public class whatIF {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        String c = "Hello";
        String d = "Java";

        System.out.println(a + b + c + d); // 30HelloJava
        System.out.println(a + c + d + b); // 10HelloJava20
        System.out.println(c + d + a + b); // HelloJava1020
        System.out.println(c + d + (a + b));//HelloJava30

        // Arithmetic Operators: +, -, *, /, %
    }
}

