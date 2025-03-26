package edu.list.people;

import edu.list.people.core.IPeopleOrder;
import edu.list.people.core.PeopleOrder;

public class App {
    public static void main(String[] args) {
        IPeopleOrder people = new PeopleOrder();

        people.addPerson("maria", 25, 1.6);
        people.addPerson("paula", 15, 1.7);
        people.addPerson("joão", 20, 1.83);

        System.out.println(people.orderByAge());
        System.out.println("-------");
        System.out.println(people.orderByHeight());
    }
}
