package com.lession_10.linkedList_example;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TESTING");
        MyLinkedList ll = new MyLinkedList(10); // constructor này ta 1 LinkList mới có nút đầu là 10
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(3, 9);
        ll.add(4, 3);
        ll.add(6, 0);
        /*
            ban đầu số 10 dùng để khởi tạo LinkedList, index của 10 là 0, mỗi lần ta gọi phương thức addFirst()
         */
        System.out.println("LinkedList size: " + ll.getNumNodes());
        ll.printList();

        System.out.println("ll index 4: " + ll.getLlEle(4));

    }
}
