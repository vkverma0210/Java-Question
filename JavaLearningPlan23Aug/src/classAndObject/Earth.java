package classAndObject;

public class Earth {

	public static void main(String[] args) {
//		Human h1;
//		h1 = new Human();
//		h1.age = 5;
//		h1.eyeColor = "black";
//		h1.heightInInches = 72;
//		h1.name = "Human Being";
//		h1.speak();
//		System.out.println();
//		
//		Human h2;
//		h2 = new Human();
//		h2.age = 10;
//		h2.eyeColor = "blue";
//		h2.heightInInches = 172;
//		h2.name = "Human Live";
//		h2.speak();
		
		Human human1 = new Human("Vinay", 23, 76, "Blue");
		Human human2 = new Human("Ram", 21, 71, "Black");
		Human human3 = new Human("Akash", 22, 66, "Brown");
		
		human1.speak();
		human2.speak();
		human3.speak();
	}

}
