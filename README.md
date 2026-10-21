# Library Management System

## Course
Java Programming Practical Assignment

## Project Description
This project is a console-based Library Management System
developed using Java 21 or higher.

The application manages library members and staff,
calculates late fees and monthly compensation,
and demonstrates object-oriented programming concepts.

## Class Hierarchy
Person (Abstract Class)
- Member
- LibraryStaff (Abstract Class)
  - Librarian
    - SeniorLibrarian
  - LibraryAssistant

## Interfaces
Reportable
- generateReport()

Reservable
- reserveBook(String bookId)

The Member class implements both interfaces.

## OOP Concepts
- Abstract Classes and Methods
- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance
- Hybrid Inheritance
- Method Overloading
- Method Overriding
- Runtime Polymorphism
- Static Variables
- Final Variables
- Interfaces

Java does not support extending multiple classes.
Interfaces provide an alternative for implementing
multiple sets of behaviors.

## Main Features
- Register library members
- Display member and staff information
- Calculate overdue book fees
- Calculate monthly staff compensation
- Generate member reports
- Demonstrate book reservations
- Validate invalid input
- Track total people, members, and staff

## How to Run
1. Open Eclipse IDE.
2. Import the LibraryManagementSystem project.
3. Ensure Java 21 or higher is installed.
4. Open src/library/Main.java.
5. Right-click Main.java.
6. Select Run As > Java Application.
7. View the results in the Console.

## Testing
TestCases.txt contains eight test cases.

SampleOutput.txt contains the program's console output.

## Programming Language
Java 21 or higher

## Application Type
Console Application