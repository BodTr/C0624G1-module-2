package com.practice.pratice_15_8_2024;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material {
    private int quantity;
    public CrispyFlour(String id, String name, LocalDate manufacturingDate, double cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double getAmount() {
        return this.quantity * super.getCost();
    }

    @Override
    public LocalDate getExpirationDate() {
        return super.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney(LocalDate dateNow) {
        long totalDays = ChronoUnit.DAYS.between(dateNow, super.getManufacturingDate());
        System.out.println("totalDays Flour: " + totalDays);
        double month = (double) totalDays / 30;
        double realPrice = 0.0;
        if (month <= 4 ) {
            realPrice = super.getCost() * 0.8;
        } else {
            realPrice = super.getCost() * 0.95;
        }
        return realPrice;

    }

    @Override
    public String toString() {
        return "CrispyFlour {" +
                "id: '" + getId() + '\'' +
                "name: '" + getName() + '\'' +
                "manufacturingDate: '" + getManufacturingDate() + '\'' +
                "cost: '" + getCost() + '\'' +
                "quantity: '" + this.quantity + '\'' +
                '}' + '\n';
    }
}
