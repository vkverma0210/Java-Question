package car_dealership;

public class Dealership {
	public static void main(String[] str) {

		Customer cust1 = new Customer("Vinay", "572 Sangam Vihar", 25000);

		Vehicle vehicle = new Vehicle("BMW", "M3", 20000);

		Employee emp = new Employee();

		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
	}
}
