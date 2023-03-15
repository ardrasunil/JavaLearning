import java.io.IOException;
public class Example5 {
	
	void m()throws IOException{
		throw new IOException("Checked Exception");
	}
	
	void n() throws IOException {
	m();
	}
	
	void p() {
		
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
	
	public static void main(String[] args) {
		Example5 obj = new Example5();
		obj.p();
		System.out.println("continued");
	}
}
