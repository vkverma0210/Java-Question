package inputOutputStream;

import java.io.*;

public class WriteString {

	public static void main(String[] args) {
		FileWriter out = null;
		
		try {
			out = new FileWriter("C:\\Users\\VI20243808\\Workspace\\JavaLearningPlan23Aug\\Char.txt");
			out.write("Welcome to Wipro Technologies.");
			System.out.println("Success.");
			out.close();
		} catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
