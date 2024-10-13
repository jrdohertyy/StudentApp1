package ie.atu.studentapp;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();
        System.out.println("Enter student 1 name: ");
        student1.setName(scanner.nextLine());
        System.out.println("Enter student 1 email: ");
        student1.setEmail(scanner.nextLine());
        System.out.println("Enter student 1 course: ");
        student1.setCourse(scanner.nextLine());

        System.out.println("Enter student 2 name: ");
        String student2Name = scanner.nextLine();
        Student student2 = new Student(student2Name);
        System.out.println("Enter student 2 email: ");
        student2.setEmail(scanner.nextLine());
        System.out.println("Enter student 2 course: ");
        student2.setCourse(scanner.nextLine());

        System.out.println("Enter student 3 name: ");
        String student3Name = scanner.nextLine();
        System.out.println("Enter student 3 email: ");
        String student3Email = scanner.nextLine();
        System.out.println("Enter student 3 course: ");
        String student3Course = scanner.nextLine();
        Student student3 = new Student(student3Name, student3Email, student3Course);

        System.out.println("\nStudent 1: " + student1.getStudentDetails());
        System.out.println("Student 2: " + student2.getStudentDetails());
        System.out.println("Student 3: " + student3.getStudentDetails());

        scanner.close();
    }
}
