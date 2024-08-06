package org.javaclaseses.Animals;

public class Crocodile extends Reptile {
    private  String egg_type;

    public Crocodile(){
        egg_type = "Hard-shelled";
    }

    public String getEgg_type() {
        return egg_type;
    }
    public String ShowInfo(){
        return toString();
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "egg_type='" + egg_type + '\'' +
                '}'+super.toString();
    }
}
