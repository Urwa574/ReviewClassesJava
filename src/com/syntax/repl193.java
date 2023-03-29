package com.syntax;

import java.util.LinkedList;

public class repl193 {
    public static void main(String[] args) {
        //Create a logic to calculate sum of the all the values in list.
        //
        //Print the result of sum.
        LinkedList<Integer> number=new LinkedList<>();
        number.add(111);
        number.add(222);
        number.add(333);
        number.add(444);
        number.add(555);
        number.add(666);
        int sum=0;
      for(int no:number){
         sum+=no;
        }
        System.out.println(sum);
    }
}
