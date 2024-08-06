package org.javaclaseses.Animals;
public class Animal {
    private int height;
    private int weight;
    private  String animal_type;
    private String blood_type;

    public Animal(){
        height = 85;
        weight =90;
        animal_type = "Bird";
        blood_type = "red";
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal_type='" + animal_type + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", blood_type='" + blood_type + '\'' +
                '}';
    }
}


