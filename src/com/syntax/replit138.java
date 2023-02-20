package com.syntax;

public class replit138 {

    String defaultmethod(){
        return "default";
    }

    protected String protectedMethod(){
        return "protected";
    }
    public String publicMethod(){
        return "public";
    }
}

class Main {
    public static void main(String[] args){
       replit138 another=new replit138();
        System.out.println(another.defaultmethod());
        System.out.println(another.protectedMethod());
        System.out.println(another.publicMethod());
    }



}

