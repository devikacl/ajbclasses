package mon4date23;

import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println();
    }
}

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // important

            students[i] = new Student(name, marks);
            System.out.println();
        }

        System.out.println("Student Details:");
        System.out.println("----------------");

        for (Student student : students) {
            student.display();
        }

        sc.close();
    }
}
	
