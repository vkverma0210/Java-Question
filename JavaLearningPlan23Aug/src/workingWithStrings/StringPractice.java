package workingWithStrings;

public class StringPractice {

	public static void main(String[] args) {
		String a = "ABCDEFG";
		System.out.println(a.length());
		System.out.println(a.substring(1));
		System.out.println(a.substring(3, 7));

		String str1 = "hello";
		String str2 = "there";

		if (str1 == "hello") {
			// Don't do this
		}

		if (str2.equals("hello")) {
			// USE THIS
		}

		if (str1.equalsIgnoreCase("Hello")) {
			System.out.println("EQUALS");
		}

		System.out.println(a.charAt(3));

		String str3 = "Hello yogi there yogi there";
		int x = str3.indexOf("there");
		System.out.println(x);
		int y = str3.indexOf("there", 7);
		System.out.println(y);
		
		int z1 = str3.indexOf("yogi");
		System.out.println(z1);
		int z = str3.lastIndexOf("yogi");
		System.out.println(z);
	}
}
