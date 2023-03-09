
public class LocalInnerClass 
{
	
	private String str = "Local Inner Class";
	
	void display() 
	{
		
		class Local
		{
			void showMsg() 
			{
			System.out.println(str);
			}
		}
		
		Local l = new Local();
		l.showMsg();
		
	}
	
	public static void main(String[] args) 
	{
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
}
