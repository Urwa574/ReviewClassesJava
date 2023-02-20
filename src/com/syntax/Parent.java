package com.syntax;

public class Parent {
    //Create a constructor, it will take a String parameter called city.
    //include the logic of printing the parameter value.
    //Create another constructor without parameter.
    //Include the logic of printing "Parent Constructor".
    // Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
    String city;
    Parent(String city){
        this.city=city;
    }
    Parent(){
        super();
    }
}
class Subclass extends Parent{
    Subclass(String city) {
        super(city);
    }
    void print(){
        System.out.println(city);
    }
}
class testing {
    public static void main(String[] args){
        Subclass sub=new Subclass("Vienna");
        sub.print();
    }}