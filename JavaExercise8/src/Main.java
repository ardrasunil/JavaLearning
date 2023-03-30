import java.util.ArrayList;
import java.util.Scanner;

import Hack.Hacker;



public class Main {
	
	public static void main(String[] args) {
		
		//object of browser 
		Browser br = new Browser();
		
		//to control while loop
		boolean more = true;
		
		//to read the values
		Scanner sc = new Scanner(System.in);
		
		//to read the url
		String url;
		
		//to control the menu option
		String choice;
		
		//create a hacker obj
		Hacker h = new Hacker();

		
		while(more) {
			System.out.println();
			System.out.println("1:ADD HISTORY");
			System.out.println("2:MODIFY HISTORY");
			System.out.println("3:DISPLAY BROWSER HISTORY");
			System.out.println("4:DISPLAY HACKER HISTORY");
			System.out.println("Exit");
			System.out.println("Enter your choice (1/2/3/4/Exit)");
			choice = sc.next();
			
			switch(choice) {
			
				case "1" :	//to add history in browser class 
							System.out.println("Enter the url to add");
							url = sc.next();
							br.addHistory(url);
							h.addToFile(br.getHistory(),"history.txt");
							break;
			
				case "2" :	//to modify the history.txt and then set 
							System.out.println("Enter the no.of url to add");
							int n = sc.nextInt();
							ArrayList<String> newUrlList = new ArrayList<>();
							for(int i =0;i<n;i++) {
								System.out.println("Enter url " + (i+1) +" :");
								url = sc.next();
								newUrlList.add(url);
							}
							br.changeHistory(h.modifyHistory(newUrlList,"history.txt"));
							break;
				
				case "3" : //to display the browser history
							System.out.println("\nHistory in browser class");
							System.out.println(br.getHistory());
							break;
			
				case "4" :  //to disp the history.txt file
							System.out.println("\n History in history.txt");
							h.dispHistory("history.txt");
							break;
			
				case "Exit" : more = false;
							  System.out.println("THANKYOU");
							  break;
						  
			default : 		System.out.println("Invalid choice");
						
				
			}
			
		}
		
		
		
	}

}
