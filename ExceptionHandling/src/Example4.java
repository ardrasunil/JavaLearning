
public class Example4 {

	void eligiblity(int age) {
		if(age<18) {
			throw new ArithmeticException("Sorry you are not eligible to vote");
		}
		else {
			System.out.println("Welcome to voter's page");
		}
	}
	
	public static void main(String[] args) {
		
		Example4 obj = new Example4();
		obj.eligiblity(10);
		obj.eligiblity(20);//this will not work
		
		
	}
}
