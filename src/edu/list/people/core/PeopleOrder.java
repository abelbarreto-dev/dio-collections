package edu.list.people.core;

import edu.list.people.model.ComparatorByHeight;
import edu.list.people.model.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleOrder implements IPeopleOrder {
    private final List<People> people;

    public PeopleOrder() {
        this.people = new ArrayList<People>();
    }

    public List<People> getPeople() {
        return people;
    }

    @Override
    public void addPerson(String name, int age, double height) {
        var person = new People();

        person.setName(name);
        person.setAge(age);
        person.setHeight(height);

        this.getPeople().add(person);
    }

    @Override
    public List<People> orderByAge() {
        // Comparable altera a variável original
        List<People> orderByAge = new ArrayList<People>(this.getPeople());

        Collections.sort(orderByAge);

        return orderByAge;
    }

    @Override
    public List<People> orderByHeight() {
        List<People> orderByHeight = new ArrayList<>(this.getPeople());

        Collections.sort(orderByHeight, new ComparatorByHeight());

        return orderByHeight;
    }
}
