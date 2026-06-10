import java.util.Scanner;

// Abstract Parent Class
abstract class Person {
    String name;
    String dept;

    abstract void display();
}

// Child Class
class Student extends Person {
    int rollNo;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        dept = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    void display() {
        System.out.println("Name       : " + name);
        System.out.println("Department : " + dept);
        System.out.println("Roll No    : " + rollNo);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Student[] s = new Student[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));
            s[i] = new Student();
            s[i].getData();
        }

        System.out.println("\n--- Student Details ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent " + (i + 1));
            s[i].display();
        }
    }
}