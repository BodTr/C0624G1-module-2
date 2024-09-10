package com.lession_12.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(101, "Trunsx", 22));
        studentsList.add(new Student(102, "Mary", 55));
        studentsList.add(new Student(103, "John", 11));

        Collections.sort(studentsList);
        for (Student student : studentsList) {
            System.out.println(student.rollno + " " + student.name + " " + student.age);
        }
    }
}
