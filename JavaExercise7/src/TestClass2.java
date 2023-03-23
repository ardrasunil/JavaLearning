import java.util.Scanner;

public class TestClass2 {
public static void main(String[] args) {
		
		boolean more = true ;
		Scanner sc = new Scanner(System.in);
		String choice;
		String url;
		String extension;
		int index;
		BrowserHistory2 tab = new BrowserHistory2();
		
		while(more) {
			
			System.out.println("\n\tOPTIONS");
			System.out.println("1.Visit");
			System.out.println("2.Fetch History using extension");
			System.out.println("3.Delete a url by extension");
			System.out.println("4.Size");
			System.out.println("5.Search");
			System.out.println("Exit");
			System.out.println("Enter Your Choice(1/2/3/4/5/Exit)");
			choice = sc.next();
			
			switch(choice) {
			
			case "1" :	System.out.println("Enter the url");
						url = sc.next();
						tab.visit(url);
						break;
			case "2" :	System.out.println("enter the extension");
			            extension = sc.next();
			            tab.fetchHistory(extension);
			            break;
			case "3" :	System.out.println("Enter the extension");
					    extension = sc.next();
					    tab.deleteHistory(extension);
						break;
			case "4" :	System.out.println("Enter the extension");
		    			extension = sc.next();
						tab.size(extension);
						break;
			case "5" :	System.out.println("enter the search word");
			            extension = sc.next();
			            tab.search(extension);
						break;
				
			case "Exit " : System.out.println("ThankYou ");
						   more = false;
			               break;
			default : System.out.println("Invalid Choice. Make a valid choice");  
			
			
			}
		}
		
	}

}
