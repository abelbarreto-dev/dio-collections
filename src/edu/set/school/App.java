package edu.set.school;

import edu.set.school.core.School;
import edu.set.school.core.SchoolInterface;

public class App {
    public static void main(String[] args) {
        try {
            SchoolInterface school = new School();

            school.addNewStudent(1L, "mauro", 7.5);
            school.addNewStudent(2L, "julio", 8);
            school.addNewStudent(3L, "paulo", 7);
            school.addNewStudent(4L, "helio", 6.5);

            school.showAllStudents();

            System.out.println("students by name".toUpperCase());
            school.showStudentsByName();

            System.out.println("students by average".toUpperCase());
            school.showStudentsByAverage();

            System.out.println("deleting paulo".toUpperCase());
            school.deleteStudent(3L);

            school.showAllStudents();
        }
        catch (RuntimeException re) {
            System.err.println(re.getMessage());
        }
    }
}
