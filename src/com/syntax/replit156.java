package com.syntax;

public class replit156 {

}
class A{
    int i=10;
   public void display(){
        System.out.println(i);
    }}
class B extends A{
    int i=20;
   public void display(){
        System.out.println(i);
       System.out.println(super.i);
    }

    public static void main(String[] args) {
        B b=new B();
        b.display();

    }
}
