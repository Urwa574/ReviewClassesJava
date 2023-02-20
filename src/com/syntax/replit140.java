package com.syntax;

public class replit140 {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!

**Expected Output:**

```
this is long
```
     */
    static String maxLength(String arr[]){
        String largestLength="";
        int max=0;
        for(String a:arr){
           if(a.length()>max){
               max=a.length();
               largestLength=a;

            }
        }
        return largestLength;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }


}
