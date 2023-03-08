
public class MemberClass {
	
	private String str = "HELLO";
	
	class InnerMemberClass
	{
		
		void getOuterMember() {
			System.out.println(str);
		}
		
	}
	
	public static void main(String[] args) {
		
		//create a object of outer class
		MemberClass obj = new MemberClass();
		MemberClass.InnerMemberClass innerObj = obj.new InnerMemberClass();
		innerObj.getOuterMember();
	}
}
