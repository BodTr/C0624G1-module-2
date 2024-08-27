package com.lession_10.practice_arraylist;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 6);
        list.displayElements();
        ArrayList<Integer> listClone = list.clone();
        listClone.add(3,7);
        System.out.println("list: " + list);
        System.out.println("listClone: " + listClone);

    }
}
