
public class Example1 {

		public static void main(String[] args) {
			
			//arithmeticException
			try {
				int number = 100/0;
				System.out.println("This statement will be skipped");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		
		
			System.out.println("Exception handled and continued");
			
			String s = null;
			//null pointer exception
			try {
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
			
			System.out.println("Exception handled and continued");
			
			//NumberFormat Exception
			String str = "abc";
			try {
				int i = Integer.parseInt(str);
			}
			catch(NumberFormatException e) {
				System.out.println(e);
			}
			
			System.out.println("Exception handled and continued");
			
			//ArrayIndexOutOfBound
			int[] a = new int[6];
			try {
				a[12] = 40;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			
			System.out.println("Exception handled and continued");
		}
}
