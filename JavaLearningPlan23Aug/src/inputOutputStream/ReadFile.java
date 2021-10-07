package inputOutputStream;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {

		try {
			FileReader in = new FileReader("C:\\Users\\VI20243808\\Workspace\\JavaLearningPlan23Aug\\Char.txt");

			int i;
			while ((i = in.read()) != -1) {
				System.out.print((char) i);
			}

			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
