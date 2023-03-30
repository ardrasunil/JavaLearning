import java.io.IOException;

public class Example1 {

public static void main(String[] args) {
	
	try {
		int i = System.in.read();
		System.out.println(i);
		System.out.println((char)i);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
