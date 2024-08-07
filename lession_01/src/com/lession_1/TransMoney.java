package com.lession_1;
import java.util.Scanner;

public class TransMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập VNĐ:");
        float vnd = sc.nextFloat();
        int rate = 23000;
        float usd = vnd / rate;
        System.out.println( vnd + " VND = " + usd + " USD");

    }
}
