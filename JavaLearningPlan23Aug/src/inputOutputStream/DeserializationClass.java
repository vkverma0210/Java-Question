package inputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp emp = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\VI20243808\\Workspace\\JavaLearningPlan23Aug\\Serial.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Emp) in.readObject();
			in.close();
			fileIn.close();
		} finally {
			System.out.println("Deserialization Employee...!");
			System.out.println("Name of Employee: " + emp.name);
			System.out.println("Address of Employee: " + emp.address);
		}
	}
}
