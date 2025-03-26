package edu.list.people.model;

import java.util.Comparator;

public class ComparatorByHeight implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
