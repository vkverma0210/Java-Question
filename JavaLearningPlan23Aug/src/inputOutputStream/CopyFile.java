package inputOutputStream;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:\\Users\\VI20243808\\Workspace\\JavaLearningPlan23Aug\\input.txt");
			out = new FileOutputStream("C:\\Users\\VI20243808\\Workspace\\JavaLearningPlan23Aug\\output.txt");

			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}

			if (out != null) {
				out.close();
			}
		}
	}

}
