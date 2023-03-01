
public class TestString1 {

public static void main(String[] args) {

	//using string literal
	//inside StringConstant pool
	String s1 = "Welcome";
	String s2 = "Welcome";
	//will not create new instance rather
	//return the reference to same instance
	
	//non pool heap memory
	//everytime new instance
	String s = new String("WElcome");
	String s3 = new String("WElcome");
	
	
	//since String is immutable this will not work
	s.concat("You");
	System.out.println(s);
	
	//but we can explicitly assign
	s = s.concat("You");
	System.out.println(s);
	
	//String Comparison
	//1:by operator checks reference
	boolean b = s1==s2;
	System.out.println(b);//true
	System.out.println(s==s3);//false
	
	//2:equals checks the content
	//string to obj
	System.out.println(s1.equals(s3)); //false
	//string to string
	//any case
	System.out.println(s1.equalsIgnoreCase(s3));//true
	
	//3:compareTo() : returns integer
	String a="Sachin";
	String d="Sachin";
	String c="Ratan";
	System.out.println(a.compareTo(d));//0
	System.out.println(a.compareTo(c));//1(because s1>s3)
	System.out.println(c.compareTo(a));//-1(because s3 < s1 )
	
	}
}
