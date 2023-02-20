package com.syntax;

public class replit147 {
    String model;
    double price;
    double quantity;
    replit147(String model,double price,double quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;

    }
    public void carStock(){
        double st=price*quantity;
        System.out.println(model+" Stock Value "+st);
    }

    public static void main(String[] args) {//Toyota 2019 Stock Value 2500000.
        replit147 replit147=new replit147("Toyota 2019",5000,5);
       replit147.carStock();
    }
}
