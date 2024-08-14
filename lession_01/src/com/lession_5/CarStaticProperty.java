package com.lession_5;

public class CarStaticProperty {
    private String name;
    private String engine;
    public static int numberOfCars;

    public CarStaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
