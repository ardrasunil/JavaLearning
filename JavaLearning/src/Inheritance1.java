//to try inheritance
//parent class bike
class Bike{
	
	public int gear;
	public int speed;
	
	//parameterised constructor
	Bike(int gear,int speed){
		this.gear = gear;
		this.speed = speed;
	}
	
	//method to decrease the speed
	public int brake(int dec) {
		speed-=dec;
		return speed;
	}
	
	//method to increase the speed
	public int incSpeed(int inc) {
		speed+=inc;
		return speed;
	}
	
	//to show the speed and gear
	public void dispDetails() {
		
		System.out.println("Number of gear "+ gear+" & speed of bike is "+speed);
		
	}
}

class mountainBike extends Bike{
	
	private int seatHeight;
	
	mountainBike(int gear, int speed,int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
		
	}
	
	public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

	@Override public void dispDetails() {
		super.dispDetails();
		System.out.println("seat height is "+seatHeight);
	}
	
}
public class Inheritance1 {
	public static void main(String[] args) {
	
		mountainBike himalayan = new mountainBike(3,100,25);
		himalayan.dispDetails();
	}
	

}
