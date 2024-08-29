package com.assignment.exercise_1;

public class TaxiBill {
    private final int kmCount;
    public TaxiBill(int kmCount) {
        this.kmCount = kmCount;
    }

    public int calculateTaxiBill() {
        return kmCount * 30000;
    }
}
