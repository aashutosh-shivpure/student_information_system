# student_information_system

Project Overview
A console-based Student Information System in core Java, split into four classes following a clean separation of concerns:

1. FileRoleStudent.java (Data model) — holds one student's info (ID, name, age, email, phone, marks) with getters/setters.
2. StudentManager.java (Business logic) — an in-memory ArrayList<Student> with add/update/delete/search/sort/average/topper operations.
3. StudentInformationSystem.java (Entry point) — console menu loop that wires user input to ValidationUtils and StudentManager.

# Data flow: 
Main menu → reads input → calls StudentManager → operates on Student objects → prints results back to console.

Core Java features used: Scanner, ArrayList, Comparator + method references.

# Setup & Run
Requirements: JDK 8 or later (I tested with JDK 21).

Put all four .java files in the same folder.
Compile:

 javac *.java

Run:

 java StudentInformationSystem

You'll see a menu — enter 1–7 to add, view, search, update, delete, view reports, or exit.

Example session:
1              → Add Student
101            → ID
Alice Smith    → Name
20             → Age
alice@x.com    → Email
9876543210     → Phone
85             → Marks

No build tool (Maven/Gradle) is needed — it's plain javac/java, so it'll run anywhere a JDK is installed.