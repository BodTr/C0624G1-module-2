package com.assignment.exercise_1;

public class ElectricMoney {
    private final int electricCount;
    public ElectricMoney(int electricCount) {
        this.electricCount = electricCount;
    }

    public int calculateElectricityBill() {
        int moneyPerNumb;
        if (electricCount <= 50) {
            moneyPerNumb = 1728;
        } else if (electricCount <= 100) {
            moneyPerNumb = 1786;
        } else if (electricCount <= 200) {
            moneyPerNumb = 2074;
        } else {
            moneyPerNumb = 2612;
        }

        return electricCount * moneyPerNumb;
    }
}
