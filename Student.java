package student_information_system;

public class Student {
	private String name;
	private int age;
	private double grade;
	private int studentId;
	private String contact;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, double grade, int studentId, String contact) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentId = studentId;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public void displayInfo() {
		System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Contact: " + contact);
        System.out.println("-----------------------------------");
	}
}
