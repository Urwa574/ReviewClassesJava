package com.syntax;

public class replit143 {
/*
    Create the following variable (**Choose proper datatype**)
* make

* model

* numberOfDoors

* topSpeed

* price

    following the proper naming convention for variables.

    Write four constructors:

            * The first constructor(with all parameters)

* A secondary constructor Have all parameters **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)

            * A third constructor Have all parameters **except make and model .** **(**make and model value should assign to "unknown" inside constructor)

            * A fourth constructor Have all parameters **except topSpeed and price**;**(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)

    Create a display method in Cars class to print the class variable value in console.

            2. Test your code with the Main.java class:

    Create several Car objects using all Constructors.

    then call display method with each object.

            Output:
    Toyota Prius 4 120 30000.0
    Toyota Prius 4 120 30000.0
    unknown unknown 4 120 30000.0
    Toyota Prius 4 90 0.0
    */
public static void main(String[] args) {
    Car car=new Car("Toyota","Prius",4,120,3000.0);
car.print2();
  Car car1=new Car("Toyota","Prius",4,120,30000.0);
    car1.print2();
  Car car2=new Car(4, 120, 30000);
    car2.print2();
  Car car3=new Car("Toyota","Prius",4);
    car3.print2();
}
}
