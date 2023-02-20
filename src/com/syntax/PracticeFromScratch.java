package com.syntax;

public class PracticeFromScratch {
    // write topic and practice below
//method
    String practice="full";
    int time=4;

    void print(){
        System.out.println("clear with methods "+practice+" "+time);
    }
public static int add(){
        int a=10,b=20;
        return a+b;
 }

    public static void main(String[] args) {
        PracticeFromScratch practiceFromScratch=new PracticeFromScratch();
        practiceFromScratch.print();
        System.out.println( PracticeFromScratch.add());
    }

}
