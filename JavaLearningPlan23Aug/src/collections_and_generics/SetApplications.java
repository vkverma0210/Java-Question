package collections_and_generics;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetApplications {
	public static void main(String[] args) {
		// 1. Sets Integer
		HashSet<Integer> hash1 = new HashSet<Integer>();
		hash1.add(12);
		hash1.add(43);
		hash1.add(15);
		hash1.add(67);
		hash1.add(43);

		for (Integer h1 : hash1) {
			System.out.println(h1);
		}

		System.out.println();

		// 2. Sets String
		HashSet<String> hash2 = new HashSet<String>();
		hash2.add("Random");
		hash2.add("Animal");
		hash2.add("People");
		hash2.add("random");
		hash2.add("Random");

		for (String h2 : hash2) {
			System.out.println(h2);
		}
		
		System.out.println();

		// 3. LinkedHashSets String
		LinkedHashSet<String> hash3 = new LinkedHashSet<String>();
		hash3.add("Random");
		hash3.add("Animal");
		hash3.add("People");
		hash3.add("random");
		hash3.add("Random");

		for (String h3 : hash3) {
			System.out.println(h3);
		}
		
		System.out.println();
		
		HashSet<Animal> hashAnimals1 = new HashSet<Animal>();
		
		Animal animals1 = new Animal("Dog", 12);
		Animal animals2 = new Animal("Cat", 8);
		Animal animals3 = new Animal("Bird", 3);
		Animal animals4 = new Animal("Dog", 12);
		Animal animals5 = new Animal("rabbit", 10);
		Animal animals6 = new Animal("Cow", 15);
		
		hashAnimals1.add(animals1);
		hashAnimals1.add(animals2);
		hashAnimals1.add(animals3);
		hashAnimals1.add(animals4);
		hashAnimals1.add(animals5);
		hashAnimals1.add(animals6);
		
		System.out.println(animals1.equals(animals4));
		System.out.println(animals1.hashCode());
		System.out.println(animals4.hashCode());
		
		for(Animal a1 : hashAnimals1)
		{
			System.out.println(a1);
		}
	}
}
