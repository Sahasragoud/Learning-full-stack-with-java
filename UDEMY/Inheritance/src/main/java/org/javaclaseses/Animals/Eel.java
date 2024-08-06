package org.javaclaseses.Animals;

public class Eel extends Fish{
    private String activity;

    public Eel(){
        activity = "releases electric charge";
    }

    @Override
    public String toString() {
        return "Eel{" +
                "activity='" + activity + '\'' +
                '}'+super.toString();
    }
}
