package com.assignment.exercise_2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactsList list = new ContactsList();
        int n;
        int id;
        String name;
        int phoneNumber;
        String email;
        String address;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm mới thông liên lạc: ");
            System.out.println("2. Sửa thông tin liên lạc: ");
            System.out.println("3. Xóa thông tin liên lạc: ");
            System.out.println("4. Hiển thị danh sách liên lạc: ");
            System.out.println("5. Tìm kiếm liên lạc theo mã liên lạc: ");
            System.out.println("0. Exit : ");
            System.out.println("Nhập sự lựa chọn: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Nhập thông tin liên lạc: ");
                    System.out.println("--------------------------");
                    System.out.println("Nhập id: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập Tên: ");
                    name = sc.nextLine();
                    System.out.println("Nhập Số điện thoại: ");
                    phoneNumber = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập email: ");
                    email = sc.nextLine();
                    System.out.println("Nhập địa chỉ: ");
                    address = sc.nextLine();
                    System.out.println("--------------------------");
                    Contact contact = new Contact(id, name, phoneNumber, email, address);
                    list.addContact(contact);
                    break;
                case 2:
                    System.out.println("Nhập mã thông tin liên lạc cần sửa: ");
                    id = Integer.parseInt(sc.nextLine());
                    int index = list.findContactIndex(id);
                    if (index == -1) {
                        System.out.println("Không tồn tại thông tin liên lạc!");
                    } else {
                        System.out.println("Nhập thông tin liên lạc cần sửa: ");
                        System.out.println("--------------------------");
                        System.out.println("Nhập id: ");
                        id = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập Tên: ");
                        name = sc.nextLine();
                        System.out.println("Nhập Số điện thoại: ");
                        phoneNumber = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập email: ");
                        email = sc.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        address = sc.nextLine();
                        System.out.println("--------------------------");
                        Contact contact1 = new Contact(id, name, phoneNumber, email, address);
                        list.editContact(index, contact1 );
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã thông tin liên lạc cần xóa: ");
                    id = Integer.parseInt(sc.nextLine());
                    int index2 = list.findContactIndex(id);
                    if (index2 == -1) {
                        System.out.println("Không tồn tại thông tin liên lạc!");
                    } else {
                        list.removeContact(index2);
                        System.out.println("Xóa thành công thông tin liên lạc");
                    }
                    break;
                case 4:
                    System.out.println("Danh sách liên lạc: ");
                    String listString = list.toString();
                    System.out.println(listString);
                    break;
                case 5:
                    System.out.println("Nhập mã thông tin liên lạc cần tìm: ");
                    id = Integer.parseInt(sc.nextLine());
                    int index3 = list.findContactIndex(id);
                    if (index3 == -1) {
                        System.out.println("Không tồn tại thông tin liên lạc");
                    } else {
                        String findedContact = list.findContact(index3);
                        System.out.println("Liên hệ cần tìm: " + findedContact);
                    }

            }
        } while (n != 0);

    }
}
