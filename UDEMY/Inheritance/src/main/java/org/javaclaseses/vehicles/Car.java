package org.javaclaseses.vehicles;

public class Car extends Vehicle {

    private String steeringWheel;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;

    public Car(){
        steeringWheel = "controlled";
        musicSystem= "on";
        airConditioner = "on";
        fridge = "off";
        entertainmentSystem = "off";

    }


    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getFridge() {
        return fridge;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    // to access the parent class variables need a parameterized const


    public Car(String engine, int fuelTank, String lights, int seats, int wheels, String airConditioner, String entertainmentSystem, String fridge, String musicSystem, String steeringWheel) {
        super(engine, fuelTank, lights, seats, wheels);
        this.airConditioner = airConditioner;
        this.entertainmentSystem = entertainmentSystem;
        this.fridge = fridge;
        this.musicSystem = musicSystem;
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "airConditioner='" + airConditioner + '\'' +
                ", steeringWheel='" + steeringWheel + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", fridge='" + fridge + '\'' +
                ", entertainmentSystem='" + entertainmentSystem + '\'' +
                "} " + super.toString();
    }
}
