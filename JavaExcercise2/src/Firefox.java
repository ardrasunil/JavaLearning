
public class Firefox extends Browser implements MultipleAccountContainers{
	
	//empty constructor
	Firefox(){
		//super();
		//this will be invoked by default
		//call the constructor(empty) in parent class
	}
	
	//parameterized constructor
	Firefox(String[] history){
		super(history);
	}
	
	//Overriding method from parent class
	public void whoAmI() {
		System.out.println("I am Firefox\n");
	}


	public void addContainer(String container) {
		
		
	}

	public void leaveContainer(String container) {
		
		
	}
}
