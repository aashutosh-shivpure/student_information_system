package student_information_system;

import java.util.Scanner;
public class StudentInformationSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean condition = true;
		while (condition) {
			System.out.println("-_.-._.-._- STUDENT INFORMATION SYSTEM -_.-._.-._-");
			System.out.println("--------------------------------------------------");
			System.out.println("1 for Add New Student");
			System.out.println("2 for View All Students");
			System.out.println("3 for Search Student");
			System.out.println("4 for Update Student");
			System.out.println("5 for Exit");
			System.out.println("");
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1: {
				StudentManager.addStudent();
				break;
			}
			case 2: {
				StudentManager.viewAllStudents();
				break;
			}
			case 3: {
				StudentManager.searchStudent();
				break;
			}
			case 4: {
				StudentManager.updateStudent();
				break;
			}
			case 5: {
				condition = false;
				System.out.println("YOU ARE SUCCESSFULLY OUT FORM STUDENT INFORMATION SYSTEM, THANKS FOR VISIT!!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
	}
}
