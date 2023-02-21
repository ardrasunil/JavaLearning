
public class Firefox extends Browser{
	
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

}
