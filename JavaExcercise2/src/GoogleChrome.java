import java.util.Scanner;

public class GoogleChrome extends Browser {
	
	boolean isLocationAccessible = false;
	boolean isCameraAccessible = false;
	boolean isMicrophoneAccessible = false;
	Scanner sc = new Scanner(System.in);
	
	private static final double versionNumber;
	static {
		versionNumber = 1.0;
	}
	
	public static double getVersionnumber() {
		return versionNumber;
	}

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
	
	//to reset permission to all false
	void resetPermission() {
		isLocationAccessible = false;
		isCameraAccessible = false;
		isMicrophoneAccessible = false;
	}
	
	//using method overloading to set value
	//set by one value
	void setPermission(boolean isAccessible) {
		boolean more = true;
		int choice;
		while(more) {
			System.out.println("SET PERMISSION");
			System.out.println(" 1 : Location");
			System.out.println(" 2 : Camera");
			System.out.println(" 3 : Microphone");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1: //to set location
					isLocationAccessible = isAccessible;
					break;
			
			case 2: //to set camera
					isCameraAccessible = isAccessible;
					break;
					
			case 3: //to set microphone
					isMicrophoneAccessible = isAccessible;
					break;
					
			default:System.out.println("Invalid choice");
				
			}
		System.out.println("Do you want to set any more access (true/false)");
		more = sc.nextBoolean();
		}
		
	}
	
	//set all the values
	void setPermission(boolean locationAccess,boolean cameraAccess, boolean microAccess) {
		isLocationAccessible = locationAccess;
		isCameraAccessible = cameraAccess;
		isMicrophoneAccessible = microAccess;
	}
	
	//to print access permision
	void showAccessPermission() {
		System.out.println("ACCESS PERMISSION");
		if(isLocationAccessible) {
			System.out.println("Location : ON");
		}
		else
		{
			System.out.println("Location : OFF");
		}
		if(isCameraAccessible) {
			System.out.println("Camera : ON");
		}
		else
		{
			System.out.println("Camera : OFF");
		}
		if(isMicrophoneAccessible) {
			System.out.println("Microphone : ON");
		}
		else
		{
			System.out.println("Microphone : OFF");
		}
	}
}
