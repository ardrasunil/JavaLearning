
public class GoogleChrome extends Browser {
	
	//empty constructor
	GoogleChrome(){
		//super();
		//this will be invoked by default
		//call the constructor(empty) in parent class
	}
	
	//parameterized constructor
	GoogleChrome(String[] history){
		super(history);
	}
	
	//Override the method from parent class 
	public void whoAmI() {
		System.out.println("I am Google Chrome\n");
	}

}
