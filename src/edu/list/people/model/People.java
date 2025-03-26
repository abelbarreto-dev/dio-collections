package edu.list.people.model;

import java.util.Comparator;

public class People implements Comparable<People> {
    private String name;
    private int age;
    private double height;

    @Override
    public int compareTo(People o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


