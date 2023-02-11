import java.util.Scanner;
import java.lang.Math;

class Shape{
	
	public double area(float radius) {
		return Math.PI*2*radius;
	}
	
	public int area(int len ,int wid) {
		return len*wid;
	}
	
}
public class Overloading {
	public static void main(String[] args) {
		boolean flag = true;	
		Shape s1 = new Shape();
		while(flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Area Menu");
			System.out.println("Choose 1 : Circle");
			System.out.println("Choose 2: Square");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			//method overloading
			case 1: System.out.println("Enter Radius");
					float radius = sc.nextFloat();
					double area = s1.area(radius);
					System.out.println(area);
					break;
			case 2: System.out.println("Enter the length ");
					int len = sc.nextInt();
					System.out.println("Enter the breadth");
					int wid = sc.nextInt();
					int ar = s1.area(len,wid);
					System.out.println(ar);
					break;

			default:System.out.println("Make a valid choice");


	

		
			}
		flag = sc.nextBoolean();
		}
	
	}
}
