package com.syntax;

public class repl180 {
    public static void main(String[] args) {
        EncapsulationDemo1 demo1=new EncapsulationDemo1();
        demo1.getEmpAge();
        demo1.getEmpName();
    }
}
class EncapsulationDemo1{
    private String empName="John";

    private int empAge=30;

    public String getEmpName() {
        System.out.println("Employee Name: "+empName);
        return empName;
    }

    public int getEmpAge() {
        System.out.println("Employee Age: "+empAge);
        return empAge;
    }
}