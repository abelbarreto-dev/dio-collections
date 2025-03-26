package edu.list.people.core;

import edu.list.people.model.People;

import java.util.List;

public interface IPeopleOrder {
    void addPerson(String name, int age, double height);
    List<People> orderByAge();
    List<People> orderByHeight();
}
