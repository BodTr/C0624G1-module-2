package com.assignment.exercise_2;
import java.util.ArrayList;

public class ContactsList<T> {
    private ArrayList<T> contacts;
    public ContactsList() {

        this.contacts = new ArrayList<>();
    }
    public void addContact(T contact) {
        contacts.add(contact);
    }
    public void setContact(int index, T contact) {
        contacts.set(index, contact);
    }
    public void displayContacts() {
        System.out.println("Hiển thị danh bạ:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }
    public T findContact(int index) {
        return contacts.get(index);
    }
    public void removeContact(int index) {
        contacts.remove(index);
    }


}
