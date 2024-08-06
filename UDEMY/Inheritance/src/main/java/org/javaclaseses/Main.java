package org.javaclaseses;

import org.javaclaseses.vehicles.Bike;
import org.javaclaseses.vehicles.Car;
import org.javaclaseses.vehicles.Truck;

public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike("petrol",2,"LED",15,2,"short");
//        bike.handle="Short";
//        bike.engine="petrol";
        System.out.println(bike.getEngine());
        System.out.println(bike);

        ///

        Car car = new Car();
//        car.steeringWheel = "controlled";
//        System.out.println((car.steeringWheel));//child class variables
//        car.wheels = 4;
//        System.out.println(car.wheels);//parent class variables

        System.out.println(car.getEntertainmentSystem());

        System.out.println(car.getFuelTank());

        System.out.println(car);

        Truck truck = new Truck();

        System.out.println(truck);


    }
}