import java.util.Scanner;
class Person{
	
	String name;
	String email;
	Scanner sc = new Scanner(System.in);
	
	Person(){
		
	}
	
	/*Person(String name,String email,String department){
		this.name = name;
		this.email = email;
		this.department = department;
	}*/
	
	public void dispDetails() {
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		
	}
	
	public void addDetails() {
		System.out.println("Enter Name :");
		name = sc.next();
		System.out.println("Enter Email :");
		email = sc.next();
	}
}
