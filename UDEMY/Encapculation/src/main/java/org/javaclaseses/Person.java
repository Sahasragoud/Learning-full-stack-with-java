package org.javaclaseses;

public class Person {
    public String name;
    public int age;
    public String gender;

    public Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
