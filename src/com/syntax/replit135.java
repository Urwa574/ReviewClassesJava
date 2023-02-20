package com.syntax;

public class replit135 {
  /*
   for understanding
   public static String surround(String s , char c){
        String strOutput =new String();
        char[] chars = s.toCharArray();  // a ,b ,c for saving char in it
        for(int i =0 ; i<chars.length;i++){
         if(chars[i]==c){
                strOutput+="("+c+")";
            }
            else{
            stroutput+=chars[i];
            }
        }
        return strOutput;
    }
    abc :  ab(c)
    abcabc: ab(c)ab(c)
    abcc : ab(c)(c)
this is how it works
   */
  static String surround(String s,char c){
      String str=new String();
      char[] chars=s.toCharArray();
      for(int i=0;i<chars.length;i++){
          if(chars[i]==c){
              str+="("+c+")";
          }
          else{
              str+=chars[i];
          }
      }
      return str;
  }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc",'c'));
        System.out.println(surround("technology",'o'));
    }
}


