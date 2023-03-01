
public class TestString5 {
	
	public static void main(String[] args) {
		
		//learning buffer and its methods
		
		StringBuffer str = new StringBuffer("Java");// 4+16 
		
		str = str.append(" Learning");
		System.out.println(str);
		
		str = str.insert(4," @");
		System.out.println(str);
		
		str = str.replace(5, 6, "Fun");
		System.out.println(str);
		System.out.println(str.delete(4,8));
		//str = str.delete(4, 8);
		System.out.println(str);
		
		
		System.out.println(str.reverse());
		System.out.println(str.capacity());
	}
}
