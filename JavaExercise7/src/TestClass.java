import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		
		boolean more = true ;
		Scanner sc = new Scanner(System.in);
		String choice;
		String url;
		String extension;
		int index;
		BrowserHistory tab = new BrowserHistory();
		
		while(more) {
			
			System.out.println("\n\tOPTIONS");
			System.out.println("1.Visit");
			System.out.println("2.Sort");
			System.out.println("3.Delete a url by index");
			System.out.println("4.Delete a url by url");
			System.out.println("5.Get History");
			System.out.println("6.Search with extension");
			System.out.println("7.Size");
			System.out.println("8.Update history");
			System.out.println("Exit");
			System.out.println("Enter Your Choice(1/2/3/4/5/6/7/8/Exit)");
			choice = sc.next();
			
			switch(choice) {
			
			case "1" :	System.out.println("Enter the url");
						url = sc.next();
						tab.visit(url);
						break;
			case "2" :	tab.sort();
						break;
			case "3" :	System.out.println("Enter index");
						index = sc.nextInt();
						tab.deleteHistory(index);
						break;
			case "4" :	System.out.println("Enter the url");
			            url = sc.next();
			            tab.deleteHistory(url);
						break;
			case "5" :	tab.fetchHistory();
						break;
			case "6" :	System.out.println("Enter the url extension u want to search");
			            extension = sc.next();
			            tab.search(extension);
						break;
			case "7" :	tab.size();
						break;
			case "8" :	System.out.println("enter the index ");
			            index = sc.nextInt();
			            System.out.println("enter the new Url");
			            url = sc.next();
			            tab.updateHistory(index, url);
						break;
				
			case "Exit " : System.out.println("ThankYou ");
						   more = false;
			               break;
			default : System.out.println("Invalid Choice. Make a valid choice");  
			
			
			}
		}
		
	}
}
