package Project;

import java.util.*;

public class StudentManager {
    private Map<Integer, Student> students = new LinkedHashMap<>();

    public void add(int roll, String name) {
        if (students.containsKey(roll)) System.out.println("Roll number already exists!");
        else {
            students.put(roll, new Student(roll, name));
            System.out.println("Student added.");
        }
    }

    public void search(int roll) {
        Student s = students.get(roll);
        System.out.println(s != null ? s : "Student not found.");
    }

    public void update(int roll, String course, String grade) {
        Student s = students.get(roll);
        if (s == null) System.out.println("Student not found.");
        else {
            s.addCourse(course, grade);
            System.out.println("Course and grade updated.");
        }
    }

    public void delete(int roll) {
        System.out.println(students.remove(roll) != null ? "Student deleted." : "Student not found.");
    }

    public void list() {
        if (students.isEmpty()) System.out.println("No students available.");
        else for (Student s : students.values()) System.out.println(s);
    }
}
