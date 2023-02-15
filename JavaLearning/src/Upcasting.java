class Parent{
	void set() {
		System.out.println("in set parent class");
	}
	
}

class Child extends Parent{
	void set() {
		super.set();
		System.out.println("in set child class");
	}
	
	void get() {
		System.out.println("in get child class");

	}

	
}
public class Upcasting{
	public static void main(String[] args) {
		
		//upcasting
		Parent p = new Child();
		p.set();
		//p.get()-not possible
		
		
	}

}

