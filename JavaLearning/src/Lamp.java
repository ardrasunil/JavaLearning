
public class Lamp {
	  
	  
	  private boolean isOn;

	  // turn on the light
	  private void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }

	  // turnoff the light
	  private void turnOff() {
	    isOn = false;
	    System.out.println("Light on" + isOn);
	  }
	  
	  public static void main(String[] args) {

		  
		    Lamp led = new Lamp();
		    Lamp halogen = new Lamp();

		    // turn on the light by
		    led.turnOn();

		    // turn off the light by
		    halogen.turnOff();
		  }
		
	}

	
	  


