package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Student;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully.");
    }

    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search Student By ID
    public Student searchStudent(int id) {

        for (Student student : students) {

            if (student.getStudentId() == id) {
                return student;
            }
        }

        return null;
    }

    // Update Student
    public boolean updateStudent(int id, String name, int age,
                                 String course, double marks) {

        Student student = searchStudent(id);

        if (student != null) {

            student.setStudentName(name);
            student.setAge(age);
            student.setCourse(course);
            student.setMarks(marks);

            return true;
        }

        return false;
    }

    // Delete Student
    public boolean deleteStudent(int id) {

        Student student = searchStudent(id);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }

    // Display Topper
    public void displayTopper() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        Student topper = students.get(0);

        for (Student student : students) {

            if (student.getMarks() > topper.getMarks()) {
                topper = student;
            }
        }

        System.out.println("===== TOPPER =====");
        System.out.println(topper);
    }

    // Average Marks
    public void averageMarks() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        double average = total / students.size();

        System.out.println("Average Marks : " + average);
    }

    // Sort By Name
    public void sortByName() {

        Collections.sort(students, Comparator.comparing(Student::getStudentName));

        System.out.println("Students sorted by name.");
    }

    // Sort By Marks
    public void sortByMarks() {

        Collections.sort(students,
                Comparator.comparingDouble(Student::getMarks).reversed());

        System.out.println("Students sorted by marks.");
    }
}