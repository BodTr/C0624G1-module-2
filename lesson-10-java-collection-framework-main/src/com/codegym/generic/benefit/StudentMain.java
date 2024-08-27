package com.codegym.generic.benefit;

import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //java 7
        list1.add(2);
        list1.add("Tèo");
        list1.add(new Student(1, "Tý"));
        System.out.println(list1);
        // => chưa nghiêm ngặt kiểm dữ liệu trong tập hợp

        ArrayList<Student> list2 = new ArrayList<>();
//        list2.add(2);
//        list2.add("Tèo");
        list2.add(new Student(1, "Tý"));
        list2.add(new Student(2, "Tèo"));
        System.out.println(list2);
    }
}
