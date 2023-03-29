package com.syntax;

public class repl165 {
    void print(){
        System.out.println("I am parent class default method");
    }
    public void print1(){
        System.out.println("I am parent public method");
    }
    private void print2(){
        System.out.println("I am parent private method");
    }
    protected void print3(){
        System.out.println("I am parent protected method");
    }
}
class child extends repl165 {
    void print(){
        System.out.println("I am a child default method");
    }

    public void print1(){
        System.out.println("I am a child public method");
    }
    protected void print2(){
        System.out.println("I am a child protected method");
    }
}

 class methodtester {
    public static void main(String[] args) {
        child c=new child();

        c.print1();

        c.print2();
        c.print();

    }

}
