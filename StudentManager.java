package student_information_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManager {


	public static List<Student> students = new ArrayList<Student>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void addStudent() {
		
		System.out.println("-_.-._.-._- ADD NEW STUDENT -_.-._.-._-");
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        
        System.out.print("Enter Name: ");
        String name = sc.next();
        
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter Grade: ");
        double grade = sc.nextDouble();
        sc.nextLine(); // Consume newline
        
        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();
        
        Student student = new Student(name ,age ,grade ,studentId ,contact);
        students.add(student);
        System.out.println("Student added successfully");
	}
	
	public static void viewAllStudents() {
		for(Student student : students) {
			System.out.println("-----------------------------------");
            System.out.println("Student Id: "+student.getStudentId());
            System.out.println("Student Name: "+student.getName());
            System.out.println("Student Age: "+student.getAge());
            System.out.println("Student Grade: "+student.getGrade());
            System.out.println("Student Contact: "+student.getContact());
		}
	}
	
	public static void searchStudent() {
		System.out.println("Enter Student Id");
		int Id = sc.nextInt();
		for(Student student : students) {
			if(Id==student.getStudentId()) {
				System.out.println("Student Found:");
				System.out.println("Id: "+student.getStudentId());
				System.out.println("Name: "+student.getName());
				System.out.println("Age: "+student.getAge());
				System.out.println("Grade: "+student.getGrade());
				System.out.println("Contact: "+student.getContact());
				break;
			}
			else {
				System.out.println("Student not Found");
			}
		}
	}
	
	public static void updateStudent() {
		System.out.println("Enter Student Id Which you want to Update: ");
		int Id = sc.nextInt();
		int count = 0;
		for(Student student : students) {
			if(Id==student.getStudentId()) {
				count=1;
				System.out.println("Student Found Successfully!! :");
				System.out.println("So now give new updated Data");
				System.out.println("");
				System.out.print("Enter Name: ");
		        String name = sc.next();
		        
		        System.out.print("Enter Age: ");
		        int age = sc.nextInt();
		        
		        System.out.print("Enter Grade: ");
		        double grade = sc.nextDouble();

		        System.out.print("Enter Contact: ");
		        String contact = sc.next();
		        
		        Student updatedStudent = new Student(name ,age ,grade ,Id ,contact);
		        students.remove(student);
		        students.add(updatedStudent);
		        System.out.println("Student Updated Successfully");
				break;
			}
		}
		if(count==0) {
			System.out.println("Student not Found");
		}
	}
	
}
