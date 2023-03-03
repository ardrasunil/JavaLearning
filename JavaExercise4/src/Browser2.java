//trying with StringBuilder

import java.util.ArrayList;
import java.util.Scanner;

public class Browser2 {
	
	ArrayList<StringBuilder> visits = new ArrayList<>();
			
	void setVisits(StringBuilder url) {
		
		boolean found = false;
		int index = 0;
		
		
	
		
	}
	
	void dispVisits() {
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Browser2 b = new Browser2();
		StringBuilder url = new StringBuilder();
		 while(true) {
			 
			 System.out.println("enter the url you visited or enter exit");
			 url.append(sc.next());
			 System.out.println(url);
			 if(url.equals("exit")) {
				 break;
			 }
			 
			 b.setVisits(url);
			 //clear the buffer everytime
			 url.delete(0, url.length());
			 
			 
			 
		 } 
    }
}
