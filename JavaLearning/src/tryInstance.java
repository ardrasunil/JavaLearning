class Figures{
	void print() {
		System.out.println("drawing shape");
	}
}
class Square extends Figures{
	void print() {
		System.out.println("drawing square");
	}
}

public class tryInstance {

	public static void main(String[] args) {
		
		Figures one = new Figures();
		System.out.println(one instanceof Figures);
		System.out.println(one instanceof Square);
		
		Square two = new Square();
		System.out.println(two instanceof Figures);
		System.out.println(two instanceof Square);
		
		Figures three = new Square();
		System.out.println(three instanceof Figures);
		System.out.println(three instanceof Square);

		Square four = null;
		System.out.println(four instanceof Square);
		
	}
}
