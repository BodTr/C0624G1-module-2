package com.assignment.exercise_2;
import java.util.ArrayList;
import java.util.List;


public class ContactsList {

    private List<Contact> contacts;
    public ContactsList() {
        this.contacts = new ArrayList<>();
    }
    public List<Contact> getContacts() {
        return contacts;
    }
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
    public int findContactIndex(int id) {
        int idC;
        int index = -1;
        for (Contact c : this.contacts) {
            idC = c.getId();

            if (idC == id) {
                index = this.contacts.indexOf(c);
                break;
            }
        }

        return index;

    }

    public String findContact(int index) {
        Contact findedContact = this.contacts.get(index);
        return findedContact.toString();
    }

    public void editContact(int index, Contact contact) {
        this.contacts.set(index, contact);
    }
    public void removeContact(int index) {
        this.contacts.remove(index);
    }
    public String toString() {
        String sumString = "";
        for (Contact c : this.contacts) {
            sumString += c.toString();
        }
        return sumString;
    }

}
