package app;

import java.util.Scanner;

import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Topper");
            System.out.println("7. Average Marks");
            System.out.println("8. Sort By Name");
            System.out.println("9. Sort By Marks");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id, name, age, course, marks);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    Student found = service.searchStudent(searchId);

                    if (found != null) {
                        System.out.println("Student Found:");
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    boolean updated = service.updateStudent(
                            updateId,
                            newName,
                            newAge,
                            newCourse,
                            newMarks);

                    if (updated)
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Student not found.");
                    break;

                case 5:
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = service.deleteStudent(deleteId);

                    if (deleted)
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Student not found.");
                    break;

                case 6:
                    service.displayTopper();
                    break;

                case 7:
                    service.averageMarks();
                    break;

                case 8:
                    service.sortByName();
                    System.out.println("Students sorted by name.");
                    service.viewStudents();
                    break;

                case 9:
                    service.sortByMarks();
                    System.out.println("Students sorted by marks.");
                    service.viewStudents();
                    break;

                case 10:
                    System.out.println("Thank you for using Student Management System!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}