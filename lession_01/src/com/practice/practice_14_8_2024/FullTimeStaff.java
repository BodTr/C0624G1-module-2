package com.practice.practice_14_8_2024;

public class FullTimeStaff extends Staff {
    private int baseSalary;
    private int bonusSalary;
    private int fine;
    FullTimeStaff(String staffCode, String name, int age, int phoneNumber, String email, int baseSalary, int bonusSalary, int fine) {
        super(staffCode, name, age, phoneNumber, email);
        this.baseSalary = baseSalary;
        this.bonusSalary = bonusSalary;
        this.fine = fine;

    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getBonusSalary() {
        return bonusSalary;
    }
    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }
    public int getFine() {
        return fine;
    }
    public void setFine(int fine) {
        this.fine = fine;
    }

    @Override
    public int calculateSalary() {
        int salary = baseSalary + bonusSalary - fine;
        return salary;
    }
}
