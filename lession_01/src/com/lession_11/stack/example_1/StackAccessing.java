package com.lession_11.stack.example_1;

import java.util.*;

class StackAccessing {

    // Main Method
    public static void main(String[] args) {

        // Default initialization of Stack
        Stack bookStack01 = new Stack();

        // Initialization of Stack
        // using Generics
        Stack<String> bookStack02 = new Stack<>();

        // pushing the elements
        bookStack01.push(10);
        bookStack01.push("Sach Thieu Nhi");
        bookStack01.push(true);

        bookStack02.push("Java");
        bookStack02.push("JavaScript");
        bookStack02.push("Python");
        bookStack02.push("PHP");
        bookStack02.push("Go");

        // Printing the Stack Elements
        System.out.println(bookStack01);
        System.out.println(bookStack02);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position wanna access: ");
        int position = sc.nextInt();

        String element = bookStack02.get(position);
        System.out.println(element);
    }
}
