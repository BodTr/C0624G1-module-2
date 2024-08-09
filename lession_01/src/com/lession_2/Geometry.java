package com.lession_2;
import java.util.Scanner;

public class Geometry {
    public static void drawTriangle() {
        int height = 6;
        // Vẽ tam giác
        System.out.println("Draw the triangle");
        for (int i = 1; i <= height; i++) {
            // In khoảng trắng phía trước
//            for (int j = height - i; j > 0; j--) {
//                System.out.print(" ");
//            }

            // In các dấu sao (*) để tạo tam giác
            for (int k = height - i + 1; k > 0; k--) {
                System.out.print("*"); // dùng print("*") thì mỗi dấu * in ra đều trong cùng 1 dòng
            }

            // Xuống dòng sau mỗi hàng
            System.out.println(); // dùng println() sẽ xuống dòng mỗi khi dùng
        }


    }
    public static void drawSquare() {
        System.out.println("Draw the square");
        int height = 6;
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= height; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawRectangle() {
        System.out.println("Draw the rectangle");
        int height = 6;
        int width = 8;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Nhập chiều cao của tam giác
//        System.out.print("Nhập chiều cao của tam giác: ");


        switch (choice) {
            case 1:
                drawTriangle();
                break;
            case 2:
                drawSquare();
                break;
            case 3:
                drawRectangle();
                break;
            case 0:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");

        }


    }
}
