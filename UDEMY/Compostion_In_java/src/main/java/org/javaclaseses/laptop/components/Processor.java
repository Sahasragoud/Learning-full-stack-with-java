package org.javaclaseses.laptop.components;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    public Processor() {
        this.brand = "Intel";
        this.cacheMemory = "5MB";
        this.cores = 4;
        this.frequency = "2.3GB";
        this.generation = 11;
        this.maxFrequency = "2.4GHZ";
        this.minFrequency = "3.14GHZ";
        this.series = "11000u";
        this.threads = 4;
    }

    public Processor(String brand, String cacheMemory, int cores, String frequency, int generation, String maxFrequency, String minFrequency, String series, int threads) {
        this.brand = brand;
        this.cacheMemory = cacheMemory;
        this.cores = cores;
        this.frequency = frequency;
        this.generation = generation;
        this.maxFrequency = maxFrequency;
        this.minFrequency = minFrequency;
        this.series = series;
        this.threads = threads;
    }

    public String getBrand() {
        return brand;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public int getCores() {
        return cores;
    }

    public String getFrequency() {
        return frequency;
    }

    public int getGeneration() {
        return generation;
    }

    public String getMaxFrequency() {
        return maxFrequency;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public String getSeries() {
        return series;
    }

    public int getThreads() {
        return threads;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", cores=" + cores +
                ", threads=" + threads +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", minFrequency='" + minFrequency + '\'' +
                ", maxFrequency='" + maxFrequency + '\'' +
                '}';
    }
}
