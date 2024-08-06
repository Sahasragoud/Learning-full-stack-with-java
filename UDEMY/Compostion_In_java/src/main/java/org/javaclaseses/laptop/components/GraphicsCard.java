package org.javaclaseses.laptop.components;

public class GraphicsCard {

    private String brand;
    private int series;
    private String memory;

    public GraphicsCard() {
        this.brand = "Nvidia";
        this.memory = "6GB";
        this.series = 3100;
    }

    public GraphicsCard(String brand, String memory, int series) {
        this.brand = brand;
        this.memory = memory;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }
}
