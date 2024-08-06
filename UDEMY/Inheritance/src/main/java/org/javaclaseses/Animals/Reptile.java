package org.javaclaseses.Animals;

public class Reptile extends Animal {
    private String skin_type;
    private String body_type;
    private String egg_type;

    public Reptile(){
        skin_type="Dry Skin";
        body_type="Backbone";
        egg_type = "soft-shelled";
    }

    public String getBody_type() {
        return body_type;
    }

    public String getEgg_type() {
        return egg_type;
    }

    public String getSkin_type() {
        return skin_type;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "body_type='" + body_type + '\'' +
                ", skin_type='" + skin_type + '\'' +
                ", egg_type='" + egg_type + '\'' +
                '}'+ super.toString();
    }


}
