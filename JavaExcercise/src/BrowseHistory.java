
import java.util.*;

class Browser{
	
	//array to store the 
	private static String[] history;
	Scanner sc = new Scanner(System.in);
	
	//empty constructor
	Browser(){
		setHistory();

	}
	
	//Parameterized Constructor
	Browser(String[] history){
		
		this.history = setHistory(history);
		
		
	}
	
	//method to set history
	public  void setHistory() {
		
		
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
	
	//method to set history if prev hist is passed
	public  String[] setHistory(String[] history) {
		// read the prev history size
		int n = history.length;
		System.out.println("No.of urls to be added more");
		int m = sc.nextInt();
		String[] temp_url = new String[n+m];
		System.arraycopy(history, 0, temp_url, 0, n);
		System.out.println("enter the url");
		for(int i=n;i<(n+m);i++) {
			temp_url[i] = sc.next();
		}
 		return temp_url;
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
