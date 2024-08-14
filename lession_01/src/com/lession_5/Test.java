package com.lession_5;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

//class A extends B { // SubCLass
//    public void p(int number) {// method overloading - phương thức ở class con sẽ cùng tên khác tham số với phương thức ở SuperClass
//        System.out.println(number);
//    }
//}

class A extends B { // SubCLass
    public void p(double number) { // method overriding - phương thức ở lớp con cùng tên cùng các tham số với phương thức này
        System.out.println(number);
    }
}

class B { // SuperClass
    public void p(double number) {
        System.out.println(number * 2);
    }
}