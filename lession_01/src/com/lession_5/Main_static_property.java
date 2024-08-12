package com.lession_5;

public class Main_static_property {
    public static void main(String[] args) {
        Car_static_property car1 = new Car_static_property("Mazda 3", "Skyactiv 3");
        System.out.println(Car_static_property.numberOfCars);
        Car_static_property car2 = new Car_static_property("Mazda 4", "Skyactiv 4");
        System.out.println(Car_static_property.numberOfCars);
    }
}
