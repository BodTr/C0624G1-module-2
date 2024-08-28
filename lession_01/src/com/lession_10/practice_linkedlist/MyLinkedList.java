package com.lession_10.practice_linkedlist;

import java.util.LinkedList;

public class MyLinkedList<T> {
    private LinkedList<T> list;
    public MyLinkedList() {
        list = new LinkedList<>();
    }
    public void add(int index, T element) { // thêm phần tử element tại index i
        list.add(index, element);
    }
    public void addFirst(T element) { // thêm phần tử element vào đầu LinkedList
        list.addFirst(element);
    }
    public void addLast(T element) { // thêm phần tử element vào cuối LinkedList
        list.addLast(element);
    }
    public T remove(int index) { // xóa phần tử có index index, trả veef phần tử được xóa
        return list.remove(index);
    }
    public boolean removeElement(T element) { // duyệt qua List xem có phần tử nào có giá trị element không, nếu có thì xóa phần tử đầu tiên có giá trị gioongs, trả về true, nếu không thì trả về false
        return list.remove(element);
    }
    public int size() {
        return list.size();
    }

    public LinkedList<T> clone() { // tạo 1 bản sao (deep copy) của list
        LinkedList<T> cloneList = new LinkedList<>();
        for (T element : list) {
            cloneList.add(element);
        }
        return cloneList;
    }

    public boolean contains(T element) {
        return list.contains(element);
    }
    public int indexOf(T element) {
        return list.indexOf(element);
    }
    public boolean add(T element) { // thêm phần tuwr element vào cuối list
        return list.add(element);
    }
    public T get(int index) {
        return list.get(index);
    }
    public T getFirst() {
        return list.getFirst();
    }
    public T getLast() {
        return list.getLast();
    }
    public void clear() {
        list.clear();
    }
}
