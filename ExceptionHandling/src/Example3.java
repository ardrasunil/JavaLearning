//finally block
public class Example3 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Inside try block");
			int data = 25/0;
			System.out.println("Inside try block");//not executed 
		}
		catch(NullPointerException e) {
			System.out.println("Exception found: type -> NULLPOINTEREXCEPTION");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception found: type -> ARITHMETICEXCEPTION");
			}
		finally {
			System.out.println("finally block is executed");
		}
		
	}

}
