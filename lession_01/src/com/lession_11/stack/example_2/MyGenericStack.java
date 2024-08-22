package com.lession_11.stack.example_2;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> { // Dấu <T> có nghĩa là ta đang dùng Generic để đặt kiểu dữ liệu chung dùng cho class MyGenericStack là T (lưu ý T ở đây là tham số kiểu (type parameter, nên nó có thể là bất kỳ chữ gì, nhưng đặt chữ T cho dễ hiểu))
    private LinkedList<T> stack; // khởi tạo thuộc tính stack của class MyGenericStack, có kiểu dữ liệu LinkedList<T> (các phần tử trong LinkedList có kiêu dữ liệu là T (Generic type))

    public MyGenericStack() { // tạo constructor của class MyGenericStack, constructor này tạo 1 stack trống bằng LinkedList có kiểu dữ liệu mỗi phần tử trong stack là T
        stack = new LinkedList<>();

    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
//    public String toString() {
//        return stack.toString();
//    }
}
