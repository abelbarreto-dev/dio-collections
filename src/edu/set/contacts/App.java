package edu.set.contacts;

import edu.set.contacts.core.ScheduleContacts;

public class App {
    public static void main(String[] args) {
        var schedule = new ScheduleContacts();

        schedule.addContact("lucas", 1146);
        schedule.addContact("abel", 1600);
        schedule.addContact("abel carvalho", 2000);
        schedule.addContact("abel", 1998);

        schedule.showContacts();

        System.out.println(schedule.findByName("abel"));
        System.out.println(schedule.findByName("josé"));

        schedule.updateContact("abel", 1998);
        System.out.println(schedule.findByName("abel"));
    }
}
