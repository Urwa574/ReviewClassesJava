package com.syntax;

public class p {
//
static int countVowels(String s){
    int count=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);

        if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'){
            count++;
        }

    }
    return count;
}

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
    }
