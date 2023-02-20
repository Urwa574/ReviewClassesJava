package practice01;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        // rows = outer loop & col= inner loop
        int n=4;
        int m=5;
        for (int i = 1; i <=n ; i++) { //outer loop
            for (int j = 1; j <=m ; j++) { //inner loop
                if(i==1||j==1||i==4||j==5){ //n=4,m=5
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();  //if and else k brackets se bahir aye ga hamesha ye.  //hallow rectangle
        }
        System.out.println("---------------");
        // half peramid
        for (int i = 1; i <=4 ; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");
        int nn=4;
        for (int i = nn; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");
        //to be continues;

        Scanner input=new Scanner (System.in);
         int a= input.nextInt();

        for(int i=0; i<a ; i++){
            for(int j=0; j<1; j++){
                System.out.println(" ");
                System.out.println("syntax");

            }
               
        }








    }
}
