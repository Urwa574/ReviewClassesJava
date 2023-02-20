package Syntax.Reveiw4;

import java.util.Scanner;

public class reveiw4o1 {
    public static void main(String[] args) {
        //# while loop
        //while (condition) {
          //  body sout and increment and decrement
        //}
        //when we do not know times we need to repeat a block of code
        int a=1;
        while (a>=3){
            System.out.println("im while loop");
            a++;
        }
        // do while at least runs once
        int b=1;
        do{
            System.out.println("do while");
            b++;
        }while (b>=3);
        //
        //Ask students if they understand loops?
        // if they don't --> tell them to practice more on loops
        // if they understand --> you good move to array concept

        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scan.nextLine();
        } while(!answer.equalsIgnoreCase("yes"));

        System.out.println("Great jobs, let's learn arrays now");


    }
}
