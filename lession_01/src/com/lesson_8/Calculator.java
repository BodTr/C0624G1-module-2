package com.lesson_8;

//import java.util.Arrays;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.parseInt(summand);
        return sum;
    }

    public int subtract(String expression) {
        String[] summand = expression.split("-");
        int result = Integer.parseInt(summand[0]);
        for (int i = 1; i < summand.length ; i++) {
            result -= Integer.parseInt(summand[i]);
        }
        return result;
    }
}
