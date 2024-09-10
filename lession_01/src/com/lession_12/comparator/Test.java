package com.lession_12.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Trunsx", 22));
        students.add(new Student(102, "Mary", 55));
        students.add(new Student(103, "John", 11));

        System.out.println("Sorting by Name");

        Collections.sort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student.rollno + " " + student.name + " " + student.age);
        }

        System.out.println("Sorting by Age");

        Collections.sort(students, new AgeComparator());
        for (Student student : students) {
            System.out.println(student.rollno + " " + student.name + " " + student.age);
        }

    }
}
