import java.util.Scanner;
class Person{
	
	private String name;
	private String email;
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
