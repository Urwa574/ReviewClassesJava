package Review8;

import Reveiw7.Car;

public class Bmw extends Car {
    Bmw(String make, String model){
        super(make,model);
    }

    @Override
    public void start() {
        System.out.println(make+" start with push start button");
    }

    @Override
    public String drive(String typeofDriving) { //protected se override kia string isliye kunky return type ha
        System.out.println(make+" drives "+typeofDriving);
        return typeofDriving;
    }

    void brake(){
        System.out.println(make+" brakes");
    }
}
