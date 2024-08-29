package com.assignment.exercise_2;



public class App {
    public static void main(String[] args) {
        Contact contact1 = new Contact(1, "Nam", 12354, "nam@gmail.com","Nhà 1, tổ 10");
        Contact contact2 = new Contact(2, "Nam", 12354, "nam@gmail.com","Nhà 1, tổ 10");
        Contact contact3 = new Contact(3, "Nam", 12354, "nam@gmail.com","Nhà 1, tổ 10");
        Contact contact4 = new Contact(4, "Nam", 12354, "nam@gmail.com","Nhà 1, tổ 10");
        Contact contact5 = new Contact(5, "Nam", 12354, "nam@gmail.com","Nhà 1, tổ 10");
        Contact contact6 = new Contact(6, "Nam", 12354, "nam@gmail.com","Nhà 1, tổ 10");
        ContactsList<Contact> contactsList = new ContactsList<>();
        contactsList.addContact(contact1);
        contactsList.addContact(contact2);
        contactsList.addContact(contact3);
        contactsList.addContact(contact4);
        contactsList.addContact(contact5);
        contactsList.addContact(contact6);

        contactsList.displayContacts();



    }
}
