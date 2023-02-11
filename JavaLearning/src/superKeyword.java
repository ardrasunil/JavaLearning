class Animal{
	Animal(){
		System.out.println("Animal is created");
	}
}
class Elephant extends Animal{
	Elephant(){
		//here the super is implicityly created 
		//super();
		System.out.println("Elephant is created");
		
	}
}

public class superKeyword {
public static void main(String[] args) {
		
		Elephant Ramu = new Elephant();
	}


}
