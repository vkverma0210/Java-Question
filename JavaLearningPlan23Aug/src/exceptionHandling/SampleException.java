package exceptionHandling;

public class SampleException {

	public static void main(String[] args) {
//		String str = null;
//		System.out.println(str.length());

//		ArithmeticException
		try {
			int a = 30, b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Can divide a number by 0");
		}

//		NumberFormatException
		try {
			int num = Integer.parseInt("Eduraka");
			System.out.println("num");
		} catch (NumberFormatException e) {
			System.out.println("String cannot be saved in integer");
		}

//		ArrayIndexOutOfBoundsException
		try {
			int a[] = new int[5];
			a[7] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Use array in range ");
		} finally {
			System.out.println("Inside finally");
		}

		try {
			throw new MyException(5);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class MyException extends Exception {
	int a;

	MyException(int b) {
		a = b;
	}

	public String toString() {
		return ("Execption number = " + a);
	}
}
