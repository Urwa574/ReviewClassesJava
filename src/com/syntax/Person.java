package com.syntax;

public class Person {
    String name;
    String lastName;
    int age;
    Person(String name, String lastName,int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }

}
class Employee extends Person{
    int salary;
    Employee(String name, String lastName, int age,int salary) {
        super(name, lastName, age);
        this.salary=salary;
    }
    public void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
}
}
class Student extends Employee{
int grade;
    Student(String name, String lastName, int age, int salary,int grade) {
        super(name, lastName, age, salary);
        this.grade=grade;
    }
    @Override
    public void print() {
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Student{
    String seniorActivity;
    Retiree(String name, String lastName, int age, int salary, int grade,String seniorActivity) {
        super(name, lastName, age, salary, grade);
        this.seniorActivity=seniorActivity;
    }

    @Override
    public void print() {
        System.out.println(name+" "+lastName+" "+grade+" "+seniorActivity);
    }
//Joe Smith 35 35000
//Adam Smith 15 10
//Frank Smith 15 tour}
    public static void main(String[] args) {
     Employee employee=new Employee("Joe","Smith",35,35000);
     employee.print();
     Student student=new Student("Addam","Smith",15,10,10);
     student.print();
     Retiree retiree=new Retiree("Frank","Smith",15,568,15,"tour");
     retiree.print();

    }
}