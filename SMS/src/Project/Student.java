package Project;

import java.util.*;

public class Student {
    private int roll;
    private String name;
    private Set<String> courses = new HashSet<>();       
    private Map<String, String> grades = new TreeMap<>(); 

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void addCourse(String course, String grade) {
        courses.add(course);
        grades.put(course, grade);
    }

    public String toString() {
        return "Roll: " + roll + " | Name: " + name + " | Courses: " + courses + " | Grades: " + grades;
    }
}
