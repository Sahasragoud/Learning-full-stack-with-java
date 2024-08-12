package org.javaclaseses;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Sreshta");
        names.add("Sahithi");
        names.add("Anusha");
        names.add("Prithi");
        names.add("Pragna");
        System.out.println(names);
        names.add(2,"swati");
        System.out.println(names);
        names.set(2,"satwika");
        System.out.println(names);
        names.remove("Anusha");
        System.out.println(names);

    }
}