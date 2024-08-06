package org.javaclaseses.vehicles;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle(){
        engine = "petrol";
        wheels = 2;
        seats = 2;
        fuelTank =14;
        lights = "LED";

    }

    public Vehicle(String engine, int fuelTank, String lights, int seats, int wheels) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.lights = lights;
        this.seats = seats;
        this.wheels = wheels;
    }



    public String getLights() {
        return lights;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", lights='" + lights + '\'' +
                '}';
    }


}
