package com.lession_5;

public class Main_static_property {
    public static void main(String[] args) {
        CarStaticProperty car1 = new CarStaticProperty("Mazda 3", "Skyactiv 3");
        System.out.println(CarStaticProperty.numberOfCars);
        CarStaticProperty car2 = new CarStaticProperty("Mazda 4", "Skyactiv 4");
        System.out.println(CarStaticProperty.numberOfCars);
    }
}
