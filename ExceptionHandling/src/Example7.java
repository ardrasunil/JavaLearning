import java.io.*;

class Parent {
	void msg() {
		System.out.println("Parent method called");
		
	}
}

class Child extends Parent{
	
	// compile time error
	/*void msg() throws IOException{
		
	}*/
	
	void msg() throws ArithmeticException{
		super.msg();
		System.out.println("Child method called");
	}
	
}

public class Example7 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.msg();
	}
}
