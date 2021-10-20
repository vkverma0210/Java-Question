package inputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.name = "Vinay Verma";
		emp.address = "Bangalore";

		try {
			FileOutputStream fileOut = new FileOutputStream(
					"C:\\Users\\VI20243808\\Workspace\\JavaLearningPlan23Aug\\Serial.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in serial.txt file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
