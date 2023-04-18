package com.syntax;

import java.util.LinkedList;

public class repl192 {
    public static void main(String[] args) {
        //Create an Linked List that will store all prime numbers from 1 to 100
        //Step 1. Create a method that will identify wether number is prime or not
        //Step 2. Add all prime numbers into Linked List
        LinkedList<Integer> primeNumbers = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i))
            {
                primeNumbers.add(i); //prime no's are those which can only be divided by itself
            }
        }

        System.out.println(primeNumbers);
    }
    public static boolean isPrime(int num) {
        boolean isPrime = num >= 2;
        for (int i = 2; i <= (num / 2); i++)
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        return isPrime;

    }

}
