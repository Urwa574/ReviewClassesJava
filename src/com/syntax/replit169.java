package com.syntax;

public class replit169 {
    public static void main(String[] args) {

        replit169 rep = new replit169();
        int[] a = {2,7,3, 8, 4};
//        double avg = avgElements(a);
        System.out.println(avgElements(a));
    }

    final static double avgElements(int[] arr) {
        //int[] a = {2, 7, 3, 8, 4};

       double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] ;
        }
        double avg =sum/arr.length;
        return avg;
    }

}