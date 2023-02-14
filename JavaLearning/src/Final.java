//using final keyword
public class Final {
	
	//final without initialisation
	final int radius;
	
	//assign value through constructor
	Final(){
		
		radius = 30;
		
	}
	
	
	//static final with value
	static final double pi = 3.14d;
	
	//without value 
	static final int constant;
	//using static block
	static {
		constant = 2;
	}
	
	
	public void circleDetails() {
		double circleArea = pi * radius * radius;
		double circlePerimeter = constant * pi * radius;
		System.out.println("Area :"+ circleArea);
		System.out.println("Area :"+ circlePerimeter);
	}

	public static void main(String[] args) {
		Final f1 = new Final();
		f1.circleDetails();
	}
}
