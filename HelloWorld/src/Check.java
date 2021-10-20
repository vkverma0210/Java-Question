
class A{
	A(){
		System.out.println("I am class A");
	}
}

class B extends A{
	
	B() {
		System.out.println("I am class B");
	}
}

class C extends B{
	
	C() {
		this.getClass();
	}
}


public class Check {

	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		A c = new C();

	}

}
