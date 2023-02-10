class Address{
	
	String district;
	String state;
	String country;
	long pincode;
	
	Address(String district,String state,String country,long pincode){
		this.district = district;
		this.state=state;
		this.country=country;
		this.pincode=pincode;
		
	}
}

class Employee{
	int empId;
	String name;
	Address address; //aggregation
	static String team="ZohoDesk";
	static String company="Zoho Corp Limited";
	
	Employee(int empId,String name,Address address) {
		
		this.empId = empId;
		this.name = name;
		this.address=address;
		
	}
	
	public void dispDetails() {
		
		System.out.println("EmpID: "+empId);
		System.out.println("Name: "+name);
		System.out.println("District: "+address.district);
		System.out.println("State: "+address.state);
		System.out.println("Country: "+address.country);
		System.out.println("PIN: "+address.pincode);
		System.out.println(team);
		System.out.println(company+"\n");
	}
}

public class Office {
	public static void main(String[] args) {
		
		Address a1 = new Address("Calicut","Kerala","India",673008);
		Address a2 = new Address("Idukki","Kerala","India",686991);
		
		Employee e1 = new Employee(123,"Ardra",a1);
		Employee e2 = new Employee(127,"Darsana",a2);
		
		e1.dispDetails();
		e2.dispDetails();
	}

}
