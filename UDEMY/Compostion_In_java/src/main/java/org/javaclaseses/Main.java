package org.javaclaseses;

import org.javaclaseses.laptop.Laptop;
import org.javaclaseses.laptop.components.GraphicsCard;
import org.javaclaseses.laptop.components.Processor;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop);
        System.out.println(laptop.getProcessor());
        System.out.println(laptop.getProcessor().getFrequency());

        Processor p1 = new Processor();
        GraphicsCard g1 = new GraphicsCard();

        Laptop l1 = new Laptop(g1,"2TB","backlit","Multi Layer",p1,"16GB",15.6f);
        System.out.println(l1);
    }

}