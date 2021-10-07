package collections_and_generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntroductionToCollections {

	public static void main(String[] args) {

		// 1. ArrayList
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("there");
		words.add("10");

		String item1 = words.get(1);

		System.out.println(item1);
		System.out.println();
		printElements(words);
		System.out.println();
		
		// 2. Linked List
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1002);

		for (int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println();
		printElements(numbers);
		System.out.println();

		// 3. Class ArrayList
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyata", "Camery", 12000, false);
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Honda", "Accord", 1200, false));
		vehicles.add(new Vehicle("Jeep", "Wrangle", 25500, true));

		for (Vehicle car : vehicles) {
			System.out.println(car);
		}
		
		System.out.println();
		printElements(vehicles);
		System.out.println();

		// 4. Class LinkedList
		List<Vehicle> vehiclesLink = new LinkedList<Vehicle>();
		Vehicle vehicle2Link = new Vehicle("Toyata", "Camery", 12000, false);
		vehiclesLink.add(vehicle2Link);
		vehiclesLink.add(new Vehicle("Honda", "Accord", 1200, false));
		vehiclesLink.add(new Vehicle("Jeep", "Wrangle", 25500, true));

		for (Vehicle car : vehiclesLink) {
			System.out.println(car);
		}
		
		System.out.println();
		printElements(vehiclesLink);
		System.out.println();
		
		// Merge two List
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(12);
		list4.add(43);
		list4.add(15);
		list4.add(67);
		list4.add(43);
		list4.add(10);
		list4.add(10);

		ArrayList <Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		
		list4.addAll(newList);
		System.out.println(list4);
		
		list4.removeAll(newList);
		System.out.println(list4);
		
//		list4.clear();
//		System.out.println(list4);
//		
		boolean hasValue = list4.contains(67);
		System.out.println(hasValue);
		
		
	}

	public static void printElements(List sameList) {
		for (int i = 0; i < sameList.size(); i++) {
			System.out.println(sameList.get(i));
		}
	}
}
