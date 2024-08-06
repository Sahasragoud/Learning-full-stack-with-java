package org.javaclaseses.vehicles;

public class Truck extends Vehicle{
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck(){
        steering = " controlled";
        musicSystem ="on";
        airConditioner = "off";
        container = 500;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getContainer() {
        return container;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getSteering() {
        return steering;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "airConditioner='" + airConditioner + '\'' +
                ", steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", container=" + container +
                '}'+super.toString();
    }
}
