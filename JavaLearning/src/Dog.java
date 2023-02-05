//sample program to test this keyword
//test empty and parameterized constructor

public class Dog {
	
	private String name;
	private String breed;
	private int age;
	
	Dog()
	{
		
	}
	
	//creating a constructor
	//trying to use this keyword
	Dog(String name,String breed,int age)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	//to get the name,breed,age we create methods
	public String dispName()
	{
		return name;
	}
	public String dispBreed()
	{
		return breed;
	}
	public int dispAge()
	{
		return age;
	}
	public void dispDetails()
	{
		System.out.println("The name of the dog is "+this.dispName());
		System.out.println("The breed of the dog is "+this.dispBreed());
		System.out.println("The age of the dog is "+this.dispAge());
		
	}
	
	public static void main(String args[])
	{	
		//passing parameters
		Dog dog1 = new Dog("Tommy","beagle",2);
		//without passing parameters
		Dog dog2 = new Dog();
		
		System.out.println("Dog 1 Details:");
		dog1.dispDetails();
		System.out.println("Dog 2 Details:");
		dog2.dispDetails();
	}

}
