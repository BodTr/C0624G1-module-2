package com.practice.pratice_15_8_2024;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material {
    private double weight;
    public Meat(String id, String name, LocalDate manufacturingDate, double cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.weight * super.getCost();
    }

    @Override
    public LocalDate getExpirationDate() {
        return super.getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney(LocalDate dateNow) {
        long totalDays = ChronoUnit.DAYS.between(dateNow, super.getManufacturingDate());
        System.out.println("totalDays Meat: " + totalDays);
        double realPrice = 0.0;
        if (totalDays <= 5 ) {
            realPrice = super.getCost() * 0.7;
        } else {
            realPrice = super.getCost() * 0.9;
        }
        return realPrice;

    }
    @Override
    public String toString() {
        return "Meat {" +
                "id: '" + getId() + '\'' +
                "name: '" + getName() + '\'' +
                "manufacturingDate: '" + getManufacturingDate() + '\'' +
                "cost: '" + getCost() + '\'' +
                "weight: '" + this.weight + '\'' +
                '}' + '\n';
    }
}
