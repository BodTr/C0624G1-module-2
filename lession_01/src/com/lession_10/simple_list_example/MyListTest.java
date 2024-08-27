package com.lession_10.simple_list_example;

public class MyListTest {
    public static void main(String[] args) {
        SimpleListExample<Integer> listInteger = new SimpleListExample<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(8);

        System.out.println("element 1: " + listInteger.get(0));
        System.out.println("element 2: " + listInteger.get(1));
        System.out.println("element 3: " + listInteger.get(2));
        System.out.println("element 4: " + listInteger.get(3));
        System.out.println("element 5: " + listInteger.get(4));


        listInteger.add(5);
        System.out.println("element 6: " + listInteger.get(5));


    }
}
