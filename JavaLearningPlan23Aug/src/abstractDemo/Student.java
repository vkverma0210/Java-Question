package abstractDemo;

public class Student extends Person {

	private int studentID;

	public Student(String name, String gender, int studentID) {
		super(name, gender);
		this.studentID = studentID;
	}

	public void studying() {
		if (studentID == 0) {
			System.out.println("Not Studing");
		} else {
			System.out.println("Studing Btech");
		}
	}

	public static void main(String[] args) {
		Person student1 = new Student("Vinay", "M", 0);
		Person student2 = new Student("Ram", "M", 2323);
		Person student3 = new Student("Poonam", "F", 4534345);
		Person student4 = new Student("Teena", "F", 342212);
		student1.studying();
		student2.studying();
		student3.studying();
		student4.studying();
	}

}
