package com.syntax;

public class replit141 {
    static int maxValue(int arr[]){
        int large=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>large){
                large=arr[i];
            }
        }
         return large;

    }
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
