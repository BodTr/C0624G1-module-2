package com.practice.practice_14_8_2024;

public class PartTimeStaff extends Staff  {
    private int workTime;
    PartTimeStaff(String staffCode, String name, int age, int phoneNumber, String email, int workTime) {
        super(staffCode, name, age, phoneNumber, email);
        this.workTime = workTime;

    }
    public int getWorkTime() {
        return workTime;
    }
    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public int calculateSalary() {
        int salary = workTime * 100000;
        return salary;
    }

    @Override
    public String toString() {
        return "PartTimeStaff{" +
                "staffCode:'" + getStaffCode() + '\'' +
                ", name: '" + getName() + '\'' +
                ", age: '" + getAge() + '\'' +
                ", phoneNumber: '" + getPhoneNumber() + '\'' +
                ", email: '" + getEmail() + '\'' +
                ", workTime: '" + getWorkTime() + '\'' +
                '}';
    }
}
