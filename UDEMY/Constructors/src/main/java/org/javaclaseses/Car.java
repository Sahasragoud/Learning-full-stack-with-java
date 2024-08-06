package org.javaclaseses;

public class Car {
    private String doors="closed";
    private String engine="on";
    private String driver="seated";
    public int speed=86;

    public void setDoors(String doors) {
      this.doors = doors;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDoors() {
        return doors;
    }

public String run(){
        if(doors.equals("closed") && engine.equals("on")
        && driver.equals("seated") && speed > 0){
            return "running";
        }
        else{
            return "not running";
        }

}

}

//