package edu.set.contacts.core;

import edu.set.contacts.model.Contact;

import java.util.HashSet;
import java.util.Set;

public class ScheduleContacts {
    private final Set<Contact> contacts;

    public ScheduleContacts() {
        this.contacts = new HashSet<>();
    }

    protected Set<Contact> getContacts() {
        return contacts;
    }

    public void addContact(String name, int phone) {
        var contact = new Contact(name, phone);

        if (!this.getContacts().add(contact)) {
            System.out.println("warning: contact already exists.");
            return;
        }

        System.out.println("contact added with success.");
    }

    public void showContacts() {
        if (this.getContacts().isEmpty()) {
            System.out.println("warning: contact set is empty.");
            return;
        }

        this.getContacts().forEach(System.out::println);
    }

    public Contact findByName(String name) {
        Contact foundContact = null;

        for (Contact contact : this.getContacts()) {
            if (contact.getName().equalsIgnoreCase(name)) {
                foundContact = contact;
                break;
            }
        }

        return foundContact;
    }

    public void updateContact(String name, int newPhone) {
        var contact = new Contact(name, newPhone);

        if (!this.getContacts().contains(contact)) {
            System.out.println("warning: contact not found.");
            return;
        }

        for (Contact varContact : this.getContacts()) {
            if (varContact.getName().equals(contact.getName())) {
                varContact.setPhone(contact.getPhone());
                break;
            }
        }

        System.out.println("contact updated with success.");
    }
}
