//multiple catch block

public class Example2 {
	public static void main(String[] args) {
		try {
		
			int arr[] = new int[5];
			//System.out.println(arr[10]); this statement 2nd gets executed
			arr[5]= 30/0;
			//System.out.println(arr[10]);
			String str = null;
			//System.out.println(str.length()); parent exception executed
		
		}
		catch(ArithmeticException e) {
			
			//customize 
			//only this catch block executed
			System.out.println("Arithmetic Exception by zero occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("PARENT EXCEPTION");
		}
		
	System.out.println("Program Continued");
	}

}
