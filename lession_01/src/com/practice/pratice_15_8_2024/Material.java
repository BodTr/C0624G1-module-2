package com.practice.pratice_15_8_2024;

import java.time.LocalDate;

public abstract class Material implements Discount {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private double cost;
    public Material(String id, String name, LocalDate manufacturingDate, double cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }
    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract double getAmount();
    public abstract LocalDate getExpirationDate();
}


