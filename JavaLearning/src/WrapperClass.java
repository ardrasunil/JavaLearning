
public class WrapperClass {
	
	public static void main(String[] args) {
		
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		double d = 50.0D;
		float f = 60.9F;
		char c = 'a';
		boolean b2 = true;
		//autoboxing
		Byte B = b;
		Short S = s;
		Integer I = i;
		Long L = l;
		Double D = d;
		Float F = f;
		Character C = c;
		Boolean B2 = b2;
		
		System.out.println("Printing object");
		System.out.println(B);
		System.out.println(S);
		System.out.println(I);
		System.out.println(L);
		System.out.println(D);
		System.out.println(F);
		System.out.println(C);
		System.out.println(B2);
		
		//unboxing
		byte newB = B;
		short newS = S;
		int newI = I;
		System.out.println("Printing primitive");
		System.out.println(newB);
		System.out.println(newS);
		System.out.println(newI);
		
		//intObj.parseInt(): to convert string to int using Integer wrapper class
		String str = "14";
		System.out.println("Multiplying a String value : " +2*Integer.parseInt(str));
		
		//boolean value from string
		Boolean value = Boolean.valueOf("True");
		System.out.println(value);
		Boolean value1 = Boolean.valueOf("False");
		System.out.println(value1);
		
		//floatObj.intValue():float to int conversion
		Float float1 = Float.valueOf(67.98f);
		int floatToInt = float1.intValue();
		System.out.println("converted float 67.98 to int :"+floatToInt);
		
		//binary to integer
		//also use parseInt()
		Integer binary = Integer.valueOf("100", 2);
		System.out.println(binary);
	}
	
	

}
