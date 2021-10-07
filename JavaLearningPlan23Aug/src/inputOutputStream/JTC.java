package inputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class JTC {

	public static void main(String[] args) throws IOException{
		System.out.println("Hii JTC students");
		System.err.println("Hii I am error msg going in console");
		
		System.setOut(new PrintStream(new FileOutputStream("abc.txt")));
		System.out.println("Hi I am going to file");
		System.out.println("Hello testing setOut");
		System.err.println("Hello error msg");
	}
}
