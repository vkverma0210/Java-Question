package collections_and_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortingDemo {

	public static void main(String[] args) {
		// 1. Sort Integer
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		hashSet.add(10);
		hashSet.add(10);

		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		Collections.sort(myList);
		System.out.println(myList);

		// 2. Sort String
		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Random");
		hashSet1.add("Tooth Brush");
		hashSet1.add("Computer");
		hashSet1.add("Cloths");

		ArrayList<String> myList1 = new ArrayList<String>(hashSet1);
		Collections.sort(myList1);
		System.out.println(myList1);

		// 3. Sort UserDefined Class
		HashSet<Employee> hashSet2 = new HashSet<Employee>();
		hashSet2.add(new Employee("Mike", 3500, "Accounting"));
		hashSet2.add(new Employee("paul", 3000, "Admin"));
		hashSet2.add(new Employee("Peter", 4000, "It"));
		hashSet2.add(new Employee("Angel", 2000, "Maintainance"));

		ArrayList<Employee> myList2 = new ArrayList<Employee>(hashSet2);
		Collections.sort(myList2);
		System.out.println(myList2);
	}

}
