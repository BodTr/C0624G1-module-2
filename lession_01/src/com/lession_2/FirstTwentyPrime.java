package com.lession_2;

public class FirstTwentyPrime {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i ==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(count + ". " + num);

            }
            num++;
        }
    }
}
