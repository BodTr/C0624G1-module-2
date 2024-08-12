package com.lession_5;

public class Main {
    public static void main(String[] args) {
        Student.change();  // calling change() method

        // creating objects
        Student s1 = new Student(1112, "Gosd");
        Student s2 = new Student(222, "GOOW");
        Student s3 = new Student(2123, "OOO");

        s1.display();
        s2.display();
        s3.display();

    }
}
