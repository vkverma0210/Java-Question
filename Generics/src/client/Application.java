package client;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
//		Container<Integer, String> container = new Container<>(12, "Hello");
//		int val1 = container.getItem1();
//		System.out.println(val1);
//		String val2 = container.getItem2();
//		System.out.println(val2);
//		System.out.println();
//		
//		Set<String> mySet1 = new HashSet<String>();
//		mySet1.add("First");
//		mySet1.add("Second");
//		mySet1.add("Whatever");
//		
//		Set<String> mySet2 = new HashSet<String>();
//		mySet2.add("First");
//		mySet2.add("Second");
//		mySet2.add("Computer");
//		
//		Set<String> resultSet = union(mySet1, mySet2);
//		
//		Iterator<String> itr = resultSet.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		System.out.println();

//		Object myObject = new Object();
//		String myVar = "Hello";
//		myObject = myVar;
//		
//		Employee emp = new Employee();
//		Accountant acc = new Accountant();
//		emp = acc;
//		
//		ArrayList<Employee> employees = new ArrayList<>();
//		ArrayList<Accountant> accountants = new ArrayList<>();
////		employees = accountants;   //Not allowed
//		
//		// WildCard
//		ArrayList<?> employees2 = new ArrayList<>();
//		ArrayList<Accountant> accountants2 = new ArrayList<>();
//		employees2 = accountants2;
//		
//		ArrayList<? extends Employee> employee3 = new ArrayList<>();
//		ArrayList<Accountant> accountants3 = new ArrayList<>();
//		employee3 = accountants3;

//		ArrayList<Employee> employees = new ArrayList<>();
//		employees.add(new Employee());
//		
//		makeEmployeeWork(employees);
		
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
		
		makeEmployeeWork(accountants);
	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

	public static void makeEmployeeWork(List<? extends Employee> employees) {
//		for (Employee emp : employees) {
//			emp.work();
//		}
		
		for(Accountant emp : (ArrayList<Accountant>) employees) {
			emp.work();
		}
	}
}