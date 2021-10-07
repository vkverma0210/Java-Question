package abstractDemo;

public abstract class Person {
	private String name;
	private String gender;

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public abstract void studying();

	public String toString() {
		return "Name = " + this.name + " :: Gender = " + this.gender;
	}
}
