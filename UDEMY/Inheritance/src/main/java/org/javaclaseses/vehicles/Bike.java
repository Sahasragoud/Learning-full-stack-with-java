package org.javaclaseses.vehicles;

public class Bike extends Vehicle{
    private String handle;

    public Bike(){
        handle="Short";
    }

    public Bike(String engine, int fuelTank, String lights, int seats, int wheels, String handle) {
        super(engine, fuelTank, lights, seats, wheels);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
}
