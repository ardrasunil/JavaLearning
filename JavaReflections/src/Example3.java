import java.lang.Class;
import java.lang.reflect.*;

class Vehicle{
	public void display() {
		System.out.println("I am a vehicle");
	}
	
	protected void start() {
		System.out.println("Vehicle started");
	}
	
	protected void stop() {
		System.out.println("Vehicle stopped");
	}
	
	private void serviceVehicle() {
		System.out.println("Vehicle serviced");
	}
}
public class Example3 {

	public static void main(String[] args) {
		try {
			Vehicle car = new Vehicle();
			Class obj = car.getClass();
			
			Method[] methods = obj.getDeclaredMethods();
			
			for(Method m: methods) {
				System.out.println("Method Name: "+ m.getName());
				
				int modifier = m.getModifiers();
				System.out.println("Modifier "+Modifier.toString(modifier)+" ");
			
				System.out.println("Return Type : "+m.getReturnType());
				System.out.println("\n");
			
			}
			
			
			
			
			
			}
		catch(Exception e) {
			e.printStackTrace();
			}
	}
}
