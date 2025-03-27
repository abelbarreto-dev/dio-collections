package edu.set.school.core;

public interface SchoolInterface {
    void addNewStudent(Long code, String name, double average);
    void deleteStudent(Long code);
    void showStudentsByName();
    void showStudentsByAverage();
    void showAllStudents();
}
