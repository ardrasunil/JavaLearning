
import java.util.Arrays;
import java.util.Scanner;

class Browser{
	
	//array to store the 
	private static String[] history;
	Scanner sc = new Scanner(System.in);
	
	//empty constructor
	Browser(){
		

	}
	
	//Parameterized Constructor
	Browser(String[] history){
		
		Browser.history =history;
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
		System.out.println("Want to add more urls?");
		System.out.println("if Yes, enter the no.of urls else enter 0.");
		int m = sc.nextInt();
		String[] temp_url = new String[n+m];
		System.arraycopy(history, 0, temp_url, 0, n);
		
		//read the urls
		if(m>0) {
			System.out.println("enter the url");
			for(int i=n;i<(n+m);i++) {
				temp_url[i] = sc.next();
			}
		}
			return temp_url;
		
	}
	
	//to get the history details
	public static void dispHistory() {
		System.out.println(Arrays.toString(history)+"\n");
		
	}
	
	//method to print who am I
	public void whoAmI() {
		System.out.println("I am a browser\n");
	}
}