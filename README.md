# Student Details Management System using Abstraction and Array in Java

## Project Overview

This project is a simple Java application that demonstrates the concepts of Object-Oriented Programming (OOP), particularly Abstraction, Inheritance, Method Overriding, and Array of Objects.

The program stores and displays the details of multiple students. It accepts student information such as Name, Department, and Roll Number from the user and displays the entered details.

## Objective

The main objective of this project is to understand how abstract classes can be used to define common properties and methods, while child classes provide their own implementation.

## Concepts Used

### 1. Abstraction

An abstract class `Person` is created to represent common details of a person.

```java
abstract class Person {
    String name;
    String dept;

    abstract void display();
}
```

The abstract method `display()` does not have a body. It must be implemented by the child class.

### 2. Inheritance

The `Student` class inherits the properties of the `Person` class using the `extends` keyword.

```java
class Student extends Person
```

This allows the Student class to reuse the variables and methods defined in the parent class.

### 3. Method Overriding

The abstract method `display()` is implemented in the Student class.

```java
void display() {
    System.out.println("Name: " + name);
    System.out.println("Department: " + dept);
    System.out.println("Roll No: " + rollNo);
}
```

### 4. Array of Objects

An array of Student objects is used to store the details of multiple students.

```java
Student[] s = new Student[3];
```

This allows the program to manage the records of 3 students efficiently.

### 5. Scanner Class

The Scanner class is used to receive input from the user.

```java
Scanner sc = new Scanner(System.in);
```

## Program Flow

1. Create an array to store 3 Student objects.
2. Accept Name, Department, and Roll Number from the user.
3. Store the details in the Student objects.
4. Display the details of all students using a loop.

## Features

* Simple and beginner-friendly program.
* Demonstrates Java OOP concepts.
* Uses abstraction and inheritance.
* Stores multiple student records using arrays.
* Displays student information in a structured format.

## Sample Output

```text
Enter Details of Student 1
Enter Name: Ramya
Enter Department: CSE
Enter Roll No: 101

Enter Details of Student 2
Enter Name: Priya
Enter Department: IT
Enter Roll No: 102

Enter Details of Student 3
Enter Name: Anu
Enter Department: ECE
Enter Roll No: 103

Student 1
Name: Ramya
Department: CSE
Roll No: 101
```

## Conclusion

This project successfully demonstrates the use of Abstraction, Inheritance, Method Overriding, Scanner Class, and Array of Objects in Java. It is suitable for beginners who want to learn the fundamentals of Object-Oriented Programming.
