package Review8;

import Reveiw7.Car;
import Reveiw7.Tesla;

public class TestCar {
    public static void main(String[] args) {
        Bmw bmw=new Bmw("Bmw","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();//comes from bmw which is subclass
        Car car=new Car("someCar","someMOdel");
        car.drive(90);
        car.start();
        Tesla tesla=new Tesla("tesla","S",2022,300,"electric",true);
        tesla.start();//overRided method from tesla class is executed
        tesla.drive(70);//comes from parent class
        tesla.haveAutopilot(); //comes from tesla class
        //Runtime polymorphism achieved through method overridding
        //casting: widening and narrowing used with primitives
        //upcasting and down casting use with non primitive
        Car bmw1=new Bmw("bmw","x77"); //upcasting
        bmw1.start();
        bmw1.drive(77);
        bmw1.drive("miami",80);
    }
    }
