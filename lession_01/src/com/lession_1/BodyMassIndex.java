package com.lession_1;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram):");
        weight = sc.nextDouble();

        System.out.println("Your height (in meter):");
        height = sc.nextDouble();
        bmi = weight / (height * height);
        String msg;
        if (bmi <  18) {
            msg = "Underweight";
        } else if (bmi < 25.0) {
            msg = "Normal";
        } else if (bmi < 30.0) {
            msg = "Overweight";
        } else {
            msg = "Obese";
        }
        System.out.println("bmi - " + bmi + " " + msg);
    }
}
