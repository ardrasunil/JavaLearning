
public class Example8 {
	
	void msg1() throws Exception{
		
		throw new ArithmeticException();
	}
	
	void msg2() throws Exception{
		msg1();
	}
	
	public static void main(String[] args) throws Exception 
	{
		Example8 obj = new Example8();
		try 
		{
		  obj.msg2();
		}
		catch(ArithmeticException e) 
		{
			System.out.println("");
		}
	}

}
