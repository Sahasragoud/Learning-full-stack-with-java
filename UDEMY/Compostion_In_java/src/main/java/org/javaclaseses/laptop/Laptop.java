package org.javaclaseses.laptop;

import org.javaclaseses.laptop.components.GraphicsCard;

import org.javaclaseses.laptop.components.Processor;

public class Laptop {
    private float source;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicCard;
    private String opticalDrive;
    private String keyboard;

    public Laptop() {
        this.graphicCard =new GraphicsCard();
        this.hardDrive = "2TB";
        this.keyboard = "backlit";
        this.opticalDrive = "Multi Layer";
        this.processor =new Processor() ;
        this.ram = "16GB";
        this.source = 15.6f;
    }

    public GraphicsCard getGraphicCard() {
        return graphicCard;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public float getSource() {
        return source;
    }

    public Laptop(GraphicsCard graphicCard, String hardDrive, String keyboard, String opticalDrive, Processor processor, String ram, float source) {
        this.graphicCard = graphicCard;
        this.hardDrive = hardDrive;
        this.keyboard = keyboard;
        this.opticalDrive = opticalDrive;
        this.processor = processor;
        this.ram = ram;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "graphicCard=" + graphicCard +
                ", source=" + source +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
