package model;

public class Student {

    private int studentId;
    private String studentName;
    private int age;
    private String course;
    private double marks;

    // Constructor
    public Student(int studentId, String studentName, int age, String course, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display Student Details
    @Override
    public String toString() {
        return "\n----------------------------------------" +
               "\nStudent ID   : " + studentId +
               "\nStudent Name : " + studentName +
               "\nAge          : " + age +
               "\nCourse       : " + course +
               "\nMarks        : " + marks +
               "\n----------------------------------------";
    }
}