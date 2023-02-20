package com.syntax;

public class replit32 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
}
    static int[][] reduce10 ( int[][] a){
        //create method reduce10 here
        for (int i = 0; i < a.length; i++) { //rows daikh rha
            for (int j = 0; j < a[i].length; j++) { //col length

                System.out.print( a[i][j] - 10+ " ");
            }
            System.out.println();

        }
        return a;
    }
}

