package com.lession_5;

public class Circle_access_modifier_exercise {
    private double radius = 1.0;
    private String color = "red";
    Circle_access_modifier_exercise() {
        System.out.println("Circle_access_modifier_exercise constructor with no param");
    }

    Circle_access_modifier_exercise(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }




}
