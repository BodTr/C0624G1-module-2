package com.lession_21.singleton;

import java.util.ArrayList;
import java.util.List;

public class CustomerManagementMenu {
    private static CustomerManagementMenu instance = null;
    private List<Customer> customers;
    private CustomerManagementMenu() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Tý"));
        customers.add(new Customer(2, "Tom"));
        customers.add(new Customer(3, "Jack"));

    }


    public List<Customer> getCustomers() {
        return customers;
    }


    public static CustomerManagementMenu getInstance() {
        if (instance == null) {
            instance = new CustomerManagementMenu();
        }
        return instance;
    }
}
