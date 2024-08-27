package com.lession_10.simple_list_example;
import java.util.Arrays;

public class SimpleListExample<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 6;
    private Object elements[];

    public SimpleListExample() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize); // Phương thức Arrays.copyOf(elements, newSize) copy tất cả các phần tử trong array cũ vào trong array mới, và array mới có capacity là newSize;
    }

    public void add(E element) {
        if  (size == elements.length) {

            ensureCapacity();
            System.out.println("Max ArrayList capacity exceeded, new capacity");
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


