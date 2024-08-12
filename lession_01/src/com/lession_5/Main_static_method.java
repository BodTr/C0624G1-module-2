package com.lession_5;

public class Main_static_method {
    public static void main(String[] args) {
        Student_static_method.change();  // calling change() method

        // creating objects
        Student_static_method s1 = new Student_static_method(1112, "Gosd");
        Student_static_method s2 = new Student_static_method(222, "GOOW");
        Student_static_method s3 = new Student_static_method(2123, "OOO");

        s1.display();
        s2.display();
        s3.display();

    }
}
