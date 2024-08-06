package org.javaclaseses.Animals;

public class Eagle extends Birds{
    public String ShowInfo(){
        return toString();
    }
    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
