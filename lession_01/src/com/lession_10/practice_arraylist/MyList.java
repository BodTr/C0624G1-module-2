package com.lession_10.practice_arraylist;
import java.util.ArrayList;

public class MyList<E> {

    private ArrayList<E> elements;

    public MyList() {
        elements = new ArrayList<>();
    }

    public void add(int index, E element) {
        elements.add(index, element);
    }

    public E remove(int index) {
        return elements.remove(index);
    }
    public int size() {
        return elements.size();
    }
    public ArrayList<E> clone() {
        return (ArrayList<E>) elements.clone();
    }

    public boolean contains(E element) {
        return elements.contains(element);
    }

    public int indexOf(E element) {
        return elements.indexOf(element);
    }

    public void add(E element) {
        elements.add(element);
    }

    public void getElement(int i) {
        System.out.println("Get element has index: " + i);
        System.out.println(elements.get(i));
    }

    public void displayElements() {
        System.out.println("Displaying elements: ");
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public void clear() {
        elements.clear();
    }

}
