package com.lession_1;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // scanner.nextFloat() chờ người dùng nhập gias trị vào từ bàn phím và nhấn enter và nó cố chuyển dữ liệu nhập vào thành kiểu float

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}

