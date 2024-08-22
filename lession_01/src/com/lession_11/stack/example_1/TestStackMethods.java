package com.lession_11.stack.example_1;

import java.util.*;

class TestStackMethods {
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack) {
        for(int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");
        Integer y = (Integer) stack.pop();
        System.out.println(y);

//        for(int i = 0; i < 5; i++) {
//            Integer y = (Integer) stack.pop();
//            System.out.println(y);
//        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        int pos = stack.search(element);

        if(pos == -1)
            System.out.printf("Element %d not found\n", element);
        else
            System.out.printf("Element %d is found at position: %d \n", element, pos);
    }


    public static void main (String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        System.out.println(stack);

//        stack_pop(stack);
//        System.out.println(stack);

        stack_peek(stack);
        System.out.println(stack);

        stack_search(stack, 0);
        stack_search(stack, 2);

//        stack_push(stack);
//        stack_peek(stack);
//        stack_search(stack, 2);
//        stack_search(stack, 6);
    }
}
