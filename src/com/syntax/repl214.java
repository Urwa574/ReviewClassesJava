package com.syntax;

public class repl214 {
    /*
    Create a custom Exception class
In main class create a method that will check students grade
if students grade is >90 then below exception should be thrown
if students grade is below 90 print "You are a great student"
In main method calls method gradeCheck and handle an Exception

**Expected Output:**

SyntaxStudentException: You are an exceptionally awesome student
```
     */

    public static void gradeCheck(int grade) throws SyntaxStudentException {
        if(grade> 90){
          throw new SyntaxStudentException("SyntaxStudentException: You are an exceptionally awesome student");
            }else {
            throw new SyntaxStudentException("SyntaxStudentException: You are a great student");
        }
    }

    public static void main(String[] args) {
       try {
           gradeCheck(60);
       } catch (SyntaxStudentException e) {
           System.out.println(e.getMessage());
       }
    }

}
 class SyntaxStudentException extends java.lang.Exception {
     public SyntaxStudentException(String msg){
    super(msg);



}
}
