package com.lession_1;
import java.util.Scanner;

public class NumberToWords {
    static String readUnits(int num) {
        String msg;
        switch (num) {
            case 1:
                msg = "one";
                break;
            case 2:
                msg = "two";
                break;
            case 3:
                msg = "three";
                break;
            case 4:
                msg = "four";
                break;
            case 5:
                msg = "five";
                break;
            case 6:
                msg = "six";
                break;
            case 7:
                msg = "seven";
                break;
            case 8:
                msg = "eight";
                break;
            case 9:
                msg = "nine";
                break;
            default:
                msg = "unknown";
        }
//        System.out.println(msg);
        return msg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String numberString = Integer.toString(num);
        int numDigitsCount = numberString.length();
        String msg;
        if (numDigitsCount == 1) {
            msg = readUnits(num);
        } else {
            msg = "abc";
        }

        System.out.println("num: " + num + " - digits count: " + numDigitsCount + " - msg: " + msg);

    }
}
