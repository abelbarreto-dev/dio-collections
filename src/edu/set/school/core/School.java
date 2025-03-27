package edu.set.school.core;

import edu.set.school.model.Student;
import edu.set.school.util.StudentByAverage;
import edu.set.school.util.StudentByName;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class School implements SchoolInterface {
    private final Set<Student> students;

    public School() {
        this.students = new HashSet<>();
    }

    protected Set<Student> getStudents() {
        return students;
    }

    @Override
    public void addNewStudent(Long code, String name, double average) {
        var student = new Student(code, name, average);

        if (!this.getStudents().add(student))
            throw new RuntimeException("error: student already exists.");

        System.out.println("success: student added.");
    }

    @Override
    public void deleteStudent(Long code) {
        Student student = this.getStudents().stream().filter(
            (Student s) -> s.getCode().equals(code)
        ).findFirst().orElse(null);

        if (student == null)
            throw new RuntimeException("error: student not found for code " + code);

        this.getStudents().remove(student);
        System.out.println("success: student deleted.");
    }

    @Override
    public void showStudentsByName() {
        Set<Student> studentsByName = new TreeSet<>(new StudentByName());

        if (!this.getStudents().isEmpty()) {
            studentsByName.addAll(this.getStudents());
            studentsByName.forEach(System.out::println);
        }
        else
            throw new RuntimeException("error: students set empty.");
    }

    @Override
    public void showStudentsByAverage() {
        Set<Student> studentsByAverage = new TreeSet<>(new StudentByAverage());

        if (!this.getStudents().isEmpty()) {
            studentsByAverage.addAll(this.getStudents());
            studentsByAverage.forEach(System.out::println);
        }
        else
            throw new RuntimeException("error: students set empty.");
    }

    @Override
    public void showAllStudents() {
        this.getStudents().forEach(System.out::println);
    }
}
