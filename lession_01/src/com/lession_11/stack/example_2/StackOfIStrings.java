package com.lession_11.stack.example_2;

public class StackOfIStrings {
    public static void main(String[] args) {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Six");
        stack.push("Seven");
        stack.push("Eight");
        stack.push("Nine");
        stack.push("Ten");
        System.out.println("Init stack: " + "\n" + stack);
        System.out.println("1.1 Size of stack: " + stack.size());
//        System.out.println("1.2 Pop element from");
    }
}
