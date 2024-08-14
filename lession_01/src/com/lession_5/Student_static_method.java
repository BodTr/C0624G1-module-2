package com.lession_5;

public class Student_static_method {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    // constructor to initialize the variable
    Student_static_method(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;

    }

    // static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    // method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
