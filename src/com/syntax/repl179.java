package com.syntax;

public class repl179 {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setEmpName("Mario");
        encapsulationDemo.getEmpName();
        encapsulationDemo.setEmpAge(32);
        encapsulationDemo.getEmpAge();
    }
}
class EncapsulationDemo{
    String empName;
    int  empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
        System.out.println("Employee Name "+empName);
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
        System.out.println("Employee Age "+empAge);
    }
}
