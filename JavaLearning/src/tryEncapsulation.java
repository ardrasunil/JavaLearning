//sample program to test encapsulation

class Person{
	private String name;
	
	//getter method
	public String getName() {
		return name;
	}
	
	//setter method
	public void setName(String name) {
		this.name = name;
	}
}

public class tryEncapsulation {
	
	public static void main(String[] args) {
		
		Person P1 = new Person();
		P1.setName("Ardra");
		System.out.println("Person 1: "+ P1.getName());
		
		Person P2 = new Person();
		System.out.println("Person 2: "+ P2.getName());
	}

}
