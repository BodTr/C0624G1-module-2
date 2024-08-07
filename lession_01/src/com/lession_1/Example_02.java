package com.lession_1;

public class Example_02 {
    public static void main(String[] args) {
        String[] nameArr = {"Nam", "Khánh", "Toanf"}; // nếu dùng '' thì java chỉ nhận là kiểu dữ liệu char, còn dùng "" thì java mới nhận String
        for (String name : nameArr) {
            System.out.println(name);
        }
        char[] nameChar = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char name : nameChar) {
            System.out.println(name);
        }
    }
}
