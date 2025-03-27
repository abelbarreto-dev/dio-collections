package edu.set.school.model;

import java.util.Objects;

public class Student {
    private Long code;
    private String name;
    private double average;

    public Student(Long code, String name, double average) {
        this.code = code;
        this.name = name;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
        "code=" + code +
        ", name='" + name + '\'' +
        ", average=" + average +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(code, student.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
