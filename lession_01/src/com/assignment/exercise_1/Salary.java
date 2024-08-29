package com.assignment.exercise_1;

public class Salary {
    private final double salary;
    public Salary(double salary) {
        this.salary = salary;
    }

    public double calculateNetSalary() {
        return salary * 0.85;
    }
}
