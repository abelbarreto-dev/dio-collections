package edu.set.contacts.model;

import java.util.Objects;

public class Contact {
    private final String name;
    private int phone;

    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(this.getName(), contact.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getName());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
