
public class Variable {
	static int m=100;//static variable
	static void method()
	{
	int n=90;//local variable
	System.out.println(n);
	}
	public static void main(String args[])
	{
	int data=50;//instance variable
	method();
	System.out.println(m);
	System.out.println(data);
	float f = 5.99f;
	char c = 'D';
	boolean Bool = true;
	String Text = "Hello";
	System.out.println(f);
	System.out.println(c);
	System.out.println(Bool);
	System.out.println(Text);
	}



}
