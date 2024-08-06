package org.javaclaseses.Animals;

public class Birds extends Animal {
    private  String body_type;
    private String mobility;

    public Birds(){
        body_type="feathers";
        mobility = "flying";
    }

    public String getBody_type() {
        return body_type;
    }

    public String getMobility() {
        return mobility;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "body_type='" + body_type + '\'' +
                ", mobility='" + mobility + '\'' +
                '}'+ super.toString();
    }
}
