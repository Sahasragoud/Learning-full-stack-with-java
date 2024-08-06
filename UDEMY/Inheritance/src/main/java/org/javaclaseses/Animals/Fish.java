package org.javaclaseses.Animals;

public class Fish extends Animal{
    private String lives_in;
    private String body_type;

    public Fish(){
        lives_in="water";
        body_type = "gills";
    }

    @Override
    public String toString() {
        return "Fish{" +
                "body_type='" + body_type + '\'' +
                ", lives_in='" + lives_in + '\'' +
                '}'+ super.toString();
    }
}
