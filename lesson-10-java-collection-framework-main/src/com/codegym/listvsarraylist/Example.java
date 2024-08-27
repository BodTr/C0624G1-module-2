package com.codegym.listvsarraylist;

import java.util.*;

public class Example {

    public static void main(String[] args) {
        //Cách viết 1:
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "Tý"));
        list1.add(new Student(2, "Tèo"));
        list1.add(new Student(3, "Tồ"));
        System.out.println("Print list1");
        System.out.println(list1);

        LinkedList<Student> list2 = new LinkedList<>();
        for (Student student: list1) {
            list2.add(student);
        }
        System.out.println("Print list2");
        System.out.println(list2);

        //Cách viết 2:
        List<Student> list3 = new ArrayList<>();
        list3.add(new Student(1, "Bin"));
        list3.add(new Student(2, "Bo"));
        list3.add(new Student(3, "Bun"));
        System.out.println("Print list3");
        System.out.println(list3);

        List<Student> list4 = new LinkedList<>(list3);
        System.out.println("Print list4");
        System.out.println(list4);
    }
}
