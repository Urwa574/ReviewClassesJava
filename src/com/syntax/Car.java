package com.syntax;

public class Car {
    String make;
    String model;
    int numberOfDoors;
   int topSpeed;
    double price;

   public Car(String make,String model,int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    // Second constructor with all parameters except numberOfDoors
    public Car(String make,String model,int topSpeed,double price){
        this(make, model, 4, topSpeed, price);

    }
    // Third constructor with all parameters except make and model
    Car(int numberOfDoors,int topSpeed,double price){
        this("unknown","unknown",numberOfDoors,topSpeed,price);
    }
    // Fourth constructor with all parameters except topSpeed and price
    Car(String make,String model,int numberOfDoors){
      this(make,model,numberOfDoors,90,0);
      }
       void print2() {
            System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
        }
    }


