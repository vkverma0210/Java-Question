package classInheritence;

public class Bird extends Animal {
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	public void move() {
		System.out.println("Flapping wings...!");
	}
}
