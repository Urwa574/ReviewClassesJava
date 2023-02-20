package com.syntax;

public class Parent153 {
    Parent153(){
        System.out.println("This is Parent constructor");
    }
}
class child2 extends Parent153{

    child2() {
        super();
    }

}
class Test123 {
    public static void main(String[] args) {
        child2 child = new child2();
    }
}