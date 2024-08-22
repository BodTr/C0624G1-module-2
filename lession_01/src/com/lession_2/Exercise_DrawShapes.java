package com.lession_2;
import java.util.Scanner;

public class Exercise_DrawShapes {
    public static void drawRectangle() {
        System.out.println("Draw the rectangle: ");
        int heigth = 6;
        int width = 20;
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangles() {

        int heigth = 8;
        System.out.println("Draw square triangles: ");
        // Tam giác có góc vuông bên trên trái
        for (int i = 0; i < heigth; i++) {
            for (int j = heigth - i; j > 0; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Tam giác có góc vuông bên trên phải
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < heigth; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Tam giác có góc vuông bên dưới phải
        for (int i = 0; i < heigth; i++) {
            for (int j = heigth; j > 0; j--) {
                if (j > i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        // Tam giác có góc vuông dưới trái
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle() {
        int height = 8;
        System.out.println("Draw isosceles triangles: ");
        for (int i = 1; i <= height; i++) {
            // In khoảng trắng phía trước
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }

            // In các dấu sao (*) để tạo tam giác
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // dùng print("*") thì mỗi dấu * in ra đều trong cùng 1 dòng
            }

            // Xuống dòng sau mỗi hàng
            System.out.println(); // dùng println() sẽ xuống dòng mỗi khi dùng
        }
    }

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangles");
        System.out.println("3. Print the isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                drawRectangle();

                break;
            case 2:
                drawSquareTriangles();
                break;
            case 3:
                drawIsoscelesTriangle();
                break;
            case 4:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}
