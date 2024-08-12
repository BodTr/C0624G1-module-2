package com.lession_5;

public class Car_static_property {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car_static_property(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
