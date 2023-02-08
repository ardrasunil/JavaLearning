
import java.util.*;

class Browser{
	
	//array to store the 
	private static String[] history;
	
	//empty constructor
	Browser(){
		setHistory();

	}
	
	//Parameterized Constructor
	Browser(String[] history){
		
		this.history = history;
		
	}
	
	//method to set history
	public  void setHistory() {
		
		Scanner sc = new Scanner(System.in);
		//read no of url to add 
		System.out.println("Enter the no.of urls:");
		int n = sc.nextInt();
		
		//read the urls
		System.out.println("Enter the urls:");
		history = new String[n];
		for(int i=0;i<n;i++) {
			history[i] = sc.next();
		}
		
	}
	
	//to get the history details
	public static void dispHistory() {
		System.out.println(Arrays.toString(history));
		
	}
}

public class BrowseHistory {
	
	public static void main(String[] args) {
		
		//call empty constructor
		Browser br1 = new Browser();
		System.out.println("history of browser 1");
		br1.dispHistory();
		
		//call parameterized
		String[] history = {"github.com","youtube.com","zoho.com","whatsapp.com","javatpoint.com"};
		Browser br2 = new Browser(history);
		System.out.println("history of browser 2");
		br2.dispHistory();
		
	}

}
