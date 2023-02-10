
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Browser{
	
	//array to store the 
	private static String[] history;
	Scanner sc = new Scanner(System.in);
	
	//empty constructor
	Browser(){
	
	}
	
	//to set History
	public void setHistory(String[] history) {
		
		Browser.history=history;
		
	}
	
	//to add URL
	public void addHistory(String newUrl) {
		
		int lenHistory = Browser.history.length;
		//System.out.println(lenHistory);
		//creating temp array
		String[] tempUrl = new String[lenHistory+1];
		for(int i =0;i<lenHistory;i++) {
			tempUrl[i]=Browser.history[i];
		}
		tempUrl[lenHistory]=newUrl;
		history=tempUrl;
		
	}
	
	//to delete URL
	public void deleteHistory(String delUrl) {
		
		boolean flag = false;
		int lenHistory = Browser.history.length;
		String[] tempUrl = new String[lenHistory-1];
		for(int i =0,j=0;i<lenHistory;i++) {
			if(Objects.equals(Browser.history[i], delUrl)) {
				flag = true;
			}
			else
			{
				tempUrl[j]=Browser.history[i];
				j++;
			}
		}
		if(flag) {
			System.out.println("Url Deleted");
		}
		else
		{
			System.out.println("Url not found");
		}
		history=tempUrl;
		
	}
	
	//to search URL
	public int searchUrl(String findUrl) {
		int index = -1;
		int lenHistory = Browser.history.length;
		for(int i =0;i<lenHistory;i++) {
			if(Objects.equals(Browser.history[i], findUrl)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	//to get Url @ given position
	public String dispUrl(int position) {
		return history[position];
	}
	
	//to get the history details
	public static void dispHistory() {
		System.out.println(Arrays.toString(history)+"\n");
		
	}
}
public class BrowserMenu {
		
	public static void main(String[] args) {
		
		//to control if the user continue to input
		boolean more = true ;
		
		//to read user input
		int choice;
		Scanner sc = new Scanner(System.in);
		
		//creating a browser object
		Browser br1 = new Browser();
		
		//instance variable to store url
		String[] history;
		
		
		//menu 
		System.out.println("\t\tWELCOME TO BROWSER MENU");
		System.out.println("Select from the following operation");
		System.out.println("1: Store a browser history");
		System.out.println("2: Add a Url");
		System.out.println("3: Delete a url");
		System.out.println("4: Search a url");
		System.out.println("5: Display the url at given position");
		
		
		
		while(more==true) {
			
			System.out.println("Make your choice (1/2/3/4/5)");
			choice = sc.nextInt();
			
			switch(choice) {
				
				case 1:	//set history
						//read no of url to add 
						System.out.println("Enter the no.of urls:");
						int n = sc.nextInt();
					
						//read the urls
						System.out.println("Enter the urls:");
						history = new String[n];
						for(int i=0;i<n;i++) {
							history[i] = sc.next();
						}
						br1.setHistory(history);
						br1.dispHistory();
						break;
						
			
				case 2: // add url
						System.out.println("Enter the url to be added");
						String newUrl = sc.next();
						br1.addHistory(newUrl);
						br1.dispHistory();
						break;
						
				case 3: // delete Url
						System.out.println("Enter the url to be deleted");
						String delUrl = sc.next();
						br1.deleteHistory(delUrl);
						br1.dispHistory();
						break;
						
				case 4: // search Url
						System.out.println("Enter the url to be searched:");
						String findUrl = sc.next();
						int found=br1.searchUrl(findUrl);
						if(found>-1)
						{
							System.out.println("URL found at position "+found);
						}
						else
						{
							System.out.println("URL not found");
						}
						br1.dispHistory();
						break;
						
				case 5: //find URL at given position
						System.out.println("Enter the position of Url to be read");
						int position = sc.nextInt();
						System.out.println("Url at "+position+" is "+br1.dispUrl(position));
						break;
						
			}
		System.out.println("Do you want to continue(true/false)");
		more = sc.nextBoolean();
		}
	}

	
		
}

		
			

	

