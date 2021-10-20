
public class Application {

	public static void main(String[] args) {

		Human tom = new Human();
		walker(tom);

		Robot wale = new Robot();
		walker(wale);

		Walkable aBlockOfCode = () -> {
			System.out.println("Custome object walking...");
		};

	}

	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
}
