package com.lession_10.simple_list_example;
import java.util.Arrays;

public class SimpleListExample<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public SimpleListExample() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element) {
        if  (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index:" + i + ", " + " Size:" + size);
        }
         return (E) elements[i];
    }

}


