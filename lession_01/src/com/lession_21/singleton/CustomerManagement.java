package com.lession_21.singleton;

import java.util.List;

public class CustomerManagement {
    public static void main(String[] args) {
        CustomerManagementMenu customerMenu = CustomerManagementMenu.getInstance(); // customerMenu đây là 1 instance của class Customer, ở class Sigleton, ta tạo constructor thông qua thuộc tính customers của class, dùng getter getCustomers() để lấy được giá trị của thuộc tính customers
        List<Customer> customers = customerMenu.getCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
